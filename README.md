# 📱 LambdaTest Internet Speed App - Mobile Automation Framework

This project automates the testing of the [testmy.net](https://testmy.net) speed test website embedded in a mobile app using **Appium**, **Java**, and **TestNG**, and executes on **LambdaTest Real Device Cloud**.

---

## 🚀 Features

- 🔹 Mobile test automation using **Appium**
- 🔹 Tests include: **Download**, **Upload**, **Latency**, and **Combined** speed tests
- 🔹 Parallel execution via **TestNG**
- 🔹 Cloud device execution with **LambdaTest**
- 🔹 Reporting with **ExtentReports**
- 🔹 Secret management with **Dotenv**
- 🔹 Retry mechanism for flaky tests
- 🔹 Cross-browser / cross-device configuration support
- 🔹 Logging via **Log4j2**

---

## 📂 Project Structure

speedtest-automation/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── base/ # Base test setup for Appium
│ │ │ ├── pages/ # Page Object classes
│ │ │ ├── utils/ # Utility classes (config, logger, reports)
│ ├── test/
│ │ └── java/
│ │ └── tests/ # Test classes for each feature
│
├── testng.xml # TestNG suite config (parallel execution)
├── pom.xml # Maven dependencies
├── .env # Secure credentials (LT_USERNAME, LT_ACCESS_KEY)
├── README.md # Project overview
