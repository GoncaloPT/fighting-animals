# Workshop

This file will have workshop takeaways

## Theory/Architecture

Client push / Server pool

### What is observability?

Instrumentation of a system to collect observability data
Send that data to an external system
Provide insights into the original system, both also having the possibility of having the overview of the full system

#### 3 Pillars

Metrics / Logs / Traces

**Metrics**

Timestamp, name, value and dimension ( tag ).  
Dimension must be a key/value, values must allow aggregation.  
Metric data is independent of request traffic.  

It is a mindset, that helps identify the root cause of issues, and predicts what can go wrong.

**Logs**


### Why?

Because we need to make sure we are using our resources. IT will take up 20% of all electricity consumption. 
**It can avoid overprovising.**

### How?



## Micrometer

Meter - interface for collecting metrics

MeterRegistry - creates and holds meter objects

### Instrument types

Common
- Counter
- Gauge
- Timer
- LongTaskTimer
- DistributionSummary

Less Common
- Time gauge
- Function counter
- Function timer

### Metric filters
- Deny/Accept
- Transform meters ( name, tags, units )

# Warnings

Make sure - using automatic instrumentation - that you only instrument specific code/components.  
 
**Sampling**

We could theoretically only get a small sample of the 200OK, but how do you know at the top services if we are getting an error downstream?





