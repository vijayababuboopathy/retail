Retail Store Discount.

Run the project, the server runs on 8090. Use postman or any rest client and use this request 

{
	"billNo": "1",
	"customerID":"vijay@gmail.com",
	"totalAmount":10000,
	"items":[{
		"sku":"AU123445",
		"skuType":"E",
		"qty":"1",
		"sellingPrice":"10000"
	}]
}

and post on the URL http://localhost:9080/bill/discount.


skuType in the request json meant type of the item { G -> Grocery, E-> Electronics, etc}.

The in memory H2 database is created with 3 customers and different type for them( Customer as C, Employee as E, Affiliate as A).

The discount applied based on the below.

1.	If the user is an employee of the store, he gets a 30% discount
2.	If the user is an affiliate of the store, he gets a 10% discount
3.	If the user has been a customer for over 2 years, he gets a 5% discount.
If the customer does not fall in any of the above then
4.	For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).


5.	The percentage based discounts do not apply on groceries.
6.	A user can get only one of the percentage based discounts on a bill.


The response is the new payable amount(after deducting the discount) with Http status 200.



