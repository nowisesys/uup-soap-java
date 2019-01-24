### Example SOAP client for project uup-soap

Java SOAP client examples for testing the uup-soap library (a SOAP service library 
written in PHP). Use the NetBeans IDE to load the project or compile from command
line using ant:

```bash
ant compile
```

Run the clients from the command line:

```bash
( cd build/classes && java client.Calculator )
( cd build/classes && java client.Employees )
```

Cleanup when done:

```bash
ant clean
```
