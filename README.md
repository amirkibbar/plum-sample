# plum-sample
a sample project that uses the [plum library](https://github.com/amirkibbar/plum)

# Running the sample

Start Consul on the localhost using http port 8500 and DNS port 8600, then:

```

    $ gradlew run
```

Access the Consul UI at http://localhost:8500/ui and expect to see the PlumSample service registered:

![PlumSample service in Consul](https://github.com/amirkibbar/plum-sample/tree/master/src/site/resources/registered-service.png)

Go to the key value store and browse through the PlumSample tree, see the access properties:

![PlumSample access properties in Consul](https://github.com/amirkibbar/plum-sample/tree/master/src/site/resources/kv-access.png)

And the application configuration:

![PlumSample configuration](https://github.com/amirkibbar/plum-sample/tree/master/src/site/resources/kv-config.png)