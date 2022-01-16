###To Do
- Mappers for Post and Comment 
- Get by id, create, update, delete endpoints
- Data validation 
- Tests for all stuff
- Jenkins pipeline
- Synchro with repository to build PR with every new commit

### Fix
- too many queries are done, when all posts are fetch it fetches comments for each post separately. I have 3 posts and 4 queries are done, 1 to get all posts and 3 to get comments for each post. Maybe it can be done by one query