function add(a=20,b=30)
{
    document.write("a= "+a+" b= "+b)
}
add();

function userFriends(username,[...friends])
{
    document.writeln(" username is "+username+" his friends are "+friends);
}

userFriends("Mike",["lilly","June","amigo","<br>"]);



function printCapitalName(...name)
{
    return name;
    
}
document.write(" "+printCapitalName("Mike","lilly","Ben","June","Amigo"));