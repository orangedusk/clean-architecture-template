                                      Clean Architecture + MVVM Template for Android
This is a template for Android apps that follows the clean architecture principle with MVVM design pattern.
This mostly follows the clean architecture suggested in the following 2 blogs:
- https://medium.com/@pavan.careers5208/detailed-guide-on-android-clean-architecture-9eab262a9011
- https://www.raywenderlich.com/3595916-clean-architecture-tutorial-for-android-getting-started


It is a simple app that displays a list of items in a recycler view. The data source is an open Rest-API : https://api.covid19india.org/data.json , that provides data about Covid19 cases in India.

The features of the template are as follows:
- Since it follows the clean architecture, the presentation layer and data layer are clearly seperated from the business logic which resides in the domain layer.
- The domain layer that contains the Interactor classes can be further expanded to contain all the business logic. It is the layer that converts the data models received from the source to the UiModels needed for the views. All classes in this layer are strictly java classes without dependencies on Android Framework. This makes them easily unit tetsable.
- The repository connects to the data source (in this case a Rest API) using Retrofit. This can be replaced with a framework of your choice like Volley or even a simple Asynctask and that will not affect the domain and view layers.
- Since it uses a totally reactive , event-driven model with LiveData, you don't have to pass listeners from the view layer to repository.   
- A user action triggers an event that inturn triggers a data request. On receiving the data, LiveData objects are updated in the repository that triggers the observers in the Interactor layer
-The interactor classes use a custom Transformation class - AsyncTransformations to convert the LiveData objects of data models received from the Rest API to LiveData of Ui Models needed for the Views asynchronously.
- The views have observers for the LiveData of Uimodels that trigger the Ui updates.
