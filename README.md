# plum-sample
a sample project that uses the [plum library](https://github.com/amirkibbar/plum)

# Running the sample

```

    $ gradlew startConsul run
```

No need to install Consul on your box - the [gradle-consul-plugin](https://github.com/amirkibbar/red-apple) does that 
for you.

Access the Consul UI at [http://localhost:8501/ui](http://localhost:8501/ui) and expect to see the PlumSample service registered:

![PlumSample service in Consul](https://raw.githubusercontent.com/amirkibbar/plum-sample/master/src/site/resources/registered-service.png)

Go to the key value store and browse through the PlumSample tree, see the access properties:

![PlumSample access properties in Consul](https://raw.githubusercontent.com/amirkibbar/plum-sample/master/src/site/resources/kv-access.png)

And the application configuration:

![PlumSample configuration](https://raw.githubusercontent.com/amirkibbar/plum-sample/master/src/site/resources/kv-config.png)