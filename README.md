# BookPedia - A Cross-Platform Book Companion App 📚

**BookPedia** is a cross-platform application built using **Jetpack Compose Multiplatform (CMP)** that runs seamlessly on Android, iOS, macOS, Windows, and Linux. The app leverages the **Open Library API** to fetch and display book data, allowing users to search for books and mark their favorites. The app also integrates **Room** for local storage and **Koin** for dependency injection.

---

## Features 🌟

- **Cross-Platform Support**: Runs on Android, iOS, macOS, Windows, and Linux.
- **Book Search**: Search books by title using the Open Library API.
- **Favorite Books**: Mark your favorite books for quick access.
- **Offline Support**: Favorites are stored locally using **Room**, ensuring offline access.
- **Clean Architecture**: Built with modern, modular architecture using **Koin** for dependency injection.

---

## Screenshots 📸



---

## Technologies Used 🛠️

- **Jetpack Compose Multiplatform (CMP)**: For building the UI across multiple platforms.
- **Open Library API**: To fetch book data dynamically.
- **Room**: For local database management.
- **Koin**: For dependency injection, enabling clean and maintainable code.
- **Kotlin Multiplatform (KMP)**: To share logic across platforms while keeping platform-specific implementations minimal.

---

## Download and Install 📥

Visit the [Releases](https://github.com/anubhav-auth/Bookpedia/releases) section to download the latest version of BookPedia for your platform. 

---

## Usage 🖐️

1. **Search for Books**: Enter the book title, author, or subject in the search bar to find books.
2. **View Details**: Click on a book to view detailed information fetched from the Open Library API.
3. **Add to Favorites**: Click the "Favorite" button to save books for offline access.
4. **Manage Favorites**: Access your saved books from the "Favorites" section.

---

## Architecture Overview 🏗️

- **UI Layer**: Built with Jetpack Compose for a modern and responsive design.
- **Data Layer**: Uses Room for local storage and Open Library API for fetching remote data.
- **Dependency Injection**: Koin ensures modularity and testability.
- **Multiplatform Code Sharing**: Core logic is shared across platforms using Kotlin Multiplatform, with minimal platform-specific implementations.

---

## License 📜

This project is licensed under the **MIT License**. See the [LICENSE](https://github.com/anubhav-auth/Bookpedia/blob/master/LICENSE.txt) file for more details.

---

## Acknowledgments 🙌

- [Open Library API](https://openlibrary.org/developers/api) for book data.
- JetBrains for Kotlin and KMP.
