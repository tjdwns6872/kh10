CREATE user khacademy IDENTIFIED by student;

grant connect, resource to khacademy;

alter user khacademy IDENTIFIED by khacademy;