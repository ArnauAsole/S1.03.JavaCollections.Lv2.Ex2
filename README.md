# 🍖🍺🍴 Restaurant Class - Sorting by Name and Rating

## Exercise Description

The goal of this exercise is to create a class `Restaurant` with two attributes: **name** (String) and **rating** (int). You must implement the necessary methods to ensure that objects of the `Restaurant` class are ordered by **name** in ascending order and **rating** in descending order when stored in a collection.

### Requirements:
- Implement the `Comparable` interface in the `Restaurant` class.
- Ensure that:
  - Restaurants are sorted by **name** in ascending order.
  - If two restaurants have the same name, they should be sorted by **rating** in descending order.
- Use a **TreeSet** or **ArrayList** to store and display the restaurants, ensuring they are ordered correctly.
- The exercise should ensure no duplicate restaurants with the same name and rating.

### Methods to implement:
- `compareTo(Restaurant other)`: Compares two `Restaurant` objects.
  - First compares by **name** in ascending order.
  - If names are the same, compares by **rating** in descending order.

---

## 💻 Technologies Used

- Java 17
- IntelliJ IDEA (Community Edition)
- Maven or Gradle (depending on the setup)

---

## 📋 Prerequisites

- Java JDK 17 installed
- IntelliJ IDEA Community Edition
- Git (for version control, optional)
- Maven or Gradle configured (if necessary for your project setup)

---

## 🛠️ Installation and Setup

### 1. **Install Required Tools**

- **Java JDK 17**: [Download and Install Java JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- **IntelliJ IDEA Community Edition**: [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- **Maven or Gradle**: Use your preferred build tool for dependency management (if applicable).

### 2. **Clone the Repository (Optional)**

If you want to work with a version-controlled repository, you can clone it from GitHub:

```bash
git clone https://github.com/ArnauAsole/S1.03.JavaCollections.Lv2.Ex2.git
cd restaurant-sorting-java
3. Open the Project
Open the project folder in IntelliJ IDEA by going to File → Open and selecting the folder where your project resides.

▶️ Running the Project
Open the Main.java class.

Run the Main method.

You will see the list of restaurants ordered by their name and rating printed to the console.

java
Copiar
Editar
Restaurant{name='restaurant1', rating=9}
Restaurant{name='restaurant1', rating=8}
Restaurant{name='restaurant2', rating=9}
Restaurant{name='restaurant2', rating=7}
Restaurant{name='restaurant3', rating=6}
🌐 Deployment
This project is a simple console-based application. It doesn't require deployment. Run it locally on your IDE (IntelliJ IDEA) to test the functionality.

🤝 Acknowledgements
Special thanks to all contributors who helped with the development of this project: Adrià, Ana, Ignasi, Alejandro.
