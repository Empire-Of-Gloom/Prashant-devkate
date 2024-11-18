# Queries for RefLocation

1. Get All RefLocations

```graphql
query {
  getAllRefLocations {
    id
    name
    region
    address
    geo
    orgId
    tenantId
    createTime
    updateTime
    deleteTime
  }
}
```

# Mutations for RefLocation

## 1. Add RefLocation Mutation

This mutation allows you to create a new RefLocation entry in the database.

```graphql
mutation {
  addRefLocation(
    subnetsV4: "192.168.1.0/24",
    subnetsV6: "2001:db8::/32",
    name: "Main Office",
    region: "North",
    address: "123 Main St, Anytown, USA",
    geo: "37.7749,-122.4194",
    orgId: "org-123",
    tenantId: "tenant-456"
  ) {
    id
    name
    region
    address
    geo
  }
}
```

2. Delete RefLocation Mutation
This mutation allows you to delete an existing RefLocation by its ID.

```graphql
mutation {
  deleteRefLocation(id: "ref-location-789") {
    message
  }
}
```

## 3. Update RefLocation Mutation

```graphql
mutation {
  updateRefLocation(
    id: "ref-location-789", 
    subnetsV4: "192.168.2.0/24", 
    subnetsV6: "2001:db8:1::/32", 
    name: "Updated Office", 
    region: "East", 
    address: "456 Updated St, New City, USA", 
    geo: "40.7128,-74.0060"
  ) {
    id
    name
    region
    address
  }
}
```

## 4. Add Multiple RefLocations (Batch Creation)

```graphql
mutation {
  addMultipleRefLocations(locations: [
      {
        subnetsV4: "192.168.10.0/24",
        subnetsV6: "2001:db8:a::/32",
        name: "Branch Office A",
        region: "West",
        address: "789 Branch St, West City, USA",
        geo: "34.0522,-118.2437",
        orgId: "org-123",
        tenantId: "tenant-456"
      },
      {
        subnetsV4: "192.168.20.0/24",
        subnetsV6: "2001:db8:b::/32",
        name: "Branch Office B",
        region: "South",
        address: "101 Branch St, South City, USA",
        geo: "29.7604,-95.3698",
        orgId: "org-124",
        tenantId: "tenant-457"
      }
  ]) {
      id
      name
      region
      address
  }
}
```