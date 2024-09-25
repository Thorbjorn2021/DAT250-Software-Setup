# Report on Software Technology Experiment Assignment 5
## Technical Problems
No technical problems.
## Validation of the installation package
Downloaded the msi installer for MongoDB. Then created a text file were I added the SHA-256 checksum to the file and gave the file a approprioate name as instructed in the tutorial to verify mongodb packages. Opened up Powershell in the directy containing both the installer and the file containing the SHA-256 checksum, and then verified the package using a script from the tutorial. The result in the screenshot below.

![validation_of_installation](https://github.com/user-attachments/assets/795ea2d0-0a95-41f9-8a51-d9008b366200)

## Experiment 1 - Results from CRUD operations
### Insert
![CRUD_insert](https://github.com/user-attachments/assets/f8d9d19d-7f2b-4f6a-8958-1f1b65d2b2d8)
### Read
![CRUD_query](https://github.com/user-attachments/assets/550cc32e-25e2-4399-a8b5-cd2089d75a0d)
### Update
![CRUD_update](https://github.com/user-attachments/assets/2e2d7b47-9602-494b-90f6-6f34d8767aaf)
### Delete
![CRUD_remove](https://github.com/user-attachments/assets/c6d539d3-8452-4b8b-846a-af1beb330da8)
### Combination of all of the above using bulkwrite
![CRUD_bulkwrite](https://github.com/user-attachments/assets/f505b196-84ab-4a00-90e7-b3f5c288327a)

## Experiment 2 - Aggregation
Result from working example:

![mapReduce_example](https://github.com/user-attachments/assets/5e511f5d-d452-48a2-8c3c-63527605c2e5)

**myMapFunction** will emit cust_id and the value of 1 for each document, indicate one order per document. **myReduceFunction** will sum up all the emitted values, adding them up and returning the count of orders.

![map_reduce_function](https://github.com/user-attachments/assets/bcc2556d-280b-4e11-becb-5df3ff8db159)

The 2 custom functions were then passed to mapReduce on the collection orders from the mapReduce tutorial. This will result in a collection named **sum_orders**

![map_reduce_call](https://github.com/user-attachments/assets/dcac41db-26f2-4de0-a827-001f9a245f3d)

In the final screenshot the collection sum_orders is then queried and sorted by values in ascending order.

![map_reduce_result](https://github.com/user-attachments/assets/10ee26b0-614b-4a67-aaa8-4080f746cfa1)

* Reason about why your implemented Map-reduce operation in Experiment 2 is useful and interpret the collection obtained.

This map-reduce operation count the number of orders on each of the customers. Could be useful for business analytics, identify top customer etc.
The collection is the total number of orders per customers.

## Pending issues
No pending issues.

