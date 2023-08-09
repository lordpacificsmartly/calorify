# Calorify App - Clean Architecture Implementation

Welcome to the Calorify App, a multi-module Android application built using the principles of Clean Architecture. This app is designed to help users track their nutritional intake based on their gender, age, height, weight, activity level, and goal. It's a comprehensive tool that utilizes various technologies and follows a clean and modular architecture.

## Features
- User Onboarding: Collect essential user details including gender, age, height, weight, activity level, and nutritional goals.
- Nutrient Tracking: Enable users to input their daily meals and track nutrient intake.
- Local Database: Utilize Room Database to store user information and nutritional data for offline access and data persistence.
- API Integration: Utilizes the OpenFood API to retrieve detailed nutritional information for different food items.
- Repository Pattern: Implement data management using repositories to abstract data sources.
- Use Cases: Defines use cases that encapsulate the business logic and operations of the app, ensuring a clear separation between different layers.
- ViewModel: Leverage ViewModel architecture to manage UI-related data and handle interactions with the underlying data sources.
- Unit Testing: Conduct unit testing to ensure the correctness of individual components.

## Modules
The app is organized into the following modules:

- **App**: This is the main module that contains the Android application code.
- **Core**: Defines the core components shared across different modules.
- **Domain**: Contains the business logic and use cases.
- **Data**: Implements data-related functionality such as data sources, repositories, and API interactions.
- **Presentation**: Handles UI-related logic, ViewModels, and UI components.

## Clean Architecture Principles
The Calorify App adheres to the principles of Clean Architecture:

- **Separation of Concerns**: Each layer (presentation, domain, and data) is isolated, facilitating easier maintenance and testing.
- **Dependency Rule**: The outer layers (presentation and data) depend on the inner layers (domain), ensuring a unidirectional flow of dependencies.
- **Abstraction and Interfaces**: Interfaces define boundaries between layers, allowing for interchangeable implementations.

## Dependencies

- Android Architecture Components (ViewModel, LiveData, Room)
- Retrofit and OkHttp for API communication
- Dagger Hilt for dependency injection
- Gson for JSON serialization/deserialization
- JUnit and Mockito for unit testing

## Setup and Usage

1. Clone the repository: `git clone https://github.com/lordpacificsmartly/Calorify.git`
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Contribution

Contributions to the project are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature: `git checkout -b feature-name`
3. Make your changes and commit them: `git commit -m "Add new feature"`
4. Push to your fork: `git push origin feature-name`
5. Open a pull request.
