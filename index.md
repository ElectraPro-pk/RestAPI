# REST API 
**BASED ON JPA, SPRING BOOT and HIBERNATE**


## Adding a New User


`/api/users/new`
**Method** : POST 
**Body** : `{
		"street_address":"ABC",
		"number": "12",
		"compliment":"na",
		"neighborhood":"na",
		"city":"ab",
		"state":"def",
		"zip":"61252",
		"uID":1
}`

## Adding a new Address
`/api/address/new`
**Method** : POST
**Body** : `{
		"name":""ABC,
		"email": "abc@abc.com",
		"dob":"2020-15-2"
}`

## Getting Address of a Specific User
`/api/get-address`
**Method** : GET
**Body** : `{
	"id":1	
}`

