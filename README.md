# spring-boot-aws-sqs-example
### 삽질
- resources에서 properties 확장자로 credentials 설정을 하면 안된다. 무조건 yml으로 해야함. 왜 그런지는 잘 모르겠음.
- 원격서버에 올리면 가끔씩 302 에러뜸. 아마 AWS SDK가 그냥 302를 핸들링을 안한거 같은데, 관련 이슈 찾아보니까 개발자들이 안고칠꺼라고 함. 여러번 삽질 해봤는데 바뀐게 IAM 계정 하나 밖에 없는데 갑자기 작동함. 왜 작동하는지는 모르겠음.
