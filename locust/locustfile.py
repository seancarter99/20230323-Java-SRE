from locust import HttpUser, task, tag

# Cookies that are returned by a request are stored
class MyUser(HttpUser):
    # This will be called upon initialization of the class
    def on_start(self):
        # Any logic to start the user, add here (ex. Login, Signup, etc.)
        self.client.post('/users/signin', json={'username': 'sean', 'password': 'password'})
    
    # Decorator that tells locust this is a task it should run on some interval
    @task
    def fetch_all_hotels(self):
        # Extract the HTTP response from the request
        with self.client.get('/hotels', catch_response=True) as response:
            # print(response.json()['roomId'])
            # response.status != 201 ... fail
            response.failure(response)

    # tags you can use to mark tasks. Using --task flag, you can selectively only run a given task
    @tag('fetch-many')
    # This number represents the weight of task. The 3 means this is 3 times more likely to be 
    @task(3)
    def fetch_hotel_by_id(self):
        for hotel_id in range(10):
            # Instead of 10 different queries, mark them all as one group
            self.client.get(f'/hotels/{hotel_id}', name='/hotels/[id]')