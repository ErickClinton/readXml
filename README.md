<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project README</title>
</head>
<body>

<h1>Project README</h1>

<h2>Introduction</h2>
<p>This project is a Java application for parsing an XML file named <code>person.xml</code> and extracting information from it. It utilizes the Java DOM API to read and process XML data.</p>

<h2>Getting Started</h2>
<ol>
    <li><strong>Clone the Repository:</strong> Clone this repository to your local machine using the following command:<br>
        <code>git clone &lt;repository-url&gt;</code></li>
    <li><strong>Open in IDE:</strong> Open the project in your preferred Java IDE, such as IntelliJ IDEA or Eclipse.</li>
    <li><strong>Modify XML File Path:</strong> In the <code>Main.java</code> file, locate the line where the XML file is parsed:<br>
        <code>Document doc = builder.parse("person.xml");</code><br>
        Replace <code>"person.xml"</code> with the absolute path to your XML file.</li>
    <li><strong>Run the Application:</strong> Run the <code>Main</code> class to start the application. It will parse the XML file and print the extracted information to the console.</li>
</ol>

<h2>Project Structure</h2>
<ul>
    <li><code>Main.java:</code> Contains the main class responsible for reading and processing the XML file.</li>
    <li><code>person.xml:</code> Sample XML file containing person information.</li>
</ul>

<h2>Usage</h2>
<p>The application reads the <code>person.xml</code> file, extracts information about each person, and prints it to the console. The XML structure is assumed to have <code>&lt;pessoa&gt;</code> elements with attributes <code>id</code>, <code>&lt;nome&gt;</code>, <code>&lt;idade&gt;</code>, and <code>&lt;peso&gt;</code> child elements.</p>

<h2>Dependencies</h2>
<ul>
    <li>Java 8 or higher</li>
    <li>No external libraries are required as the project utilizes the Java DOM API for XML parsing.</li>
</ul>

<h2>Contributions</h2>
<p>Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or create a pull request.</p>

<h2>License</h2>
<p>This project is licensed under the <a href="LICENSE">MIT License</a>. Feel free to use, modify, and distribute it as per the terms of the license.</p>

</body>
</html>
