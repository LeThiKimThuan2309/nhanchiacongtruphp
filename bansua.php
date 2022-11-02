<?php
//1. Ket noi CSDL kieu thu tuc
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "quanly_ban_sua";
$conn=mysqli_connect($servername,$username,$password,$dbname);

if(!$conn){
    die ("Connection failed: " .mysqli_connect_error());
}
else echo "Ket noi thanh cong!!<br>";

//2. Chuan bi cau truy van
$query = 'SELECT * FROM khach_hang ';//WHERE Phai=0' ;

//3. thuc thi cau truy van
$result = mysqli_query($conn,$query);
if(!$result) die ('<br> <b>Query failed</b>');
else echo "Thuc thi cau truy van thanh cong<br>";

//4. Xu ly du lieu tra ve
if(mysqli_num_rows($result)!=0){
    while($row = mysqli_fetch_array($result))
    {
        if(substr($row[0],-1)>=5 and $row['Phai']==0){
            for($i=0;$i<mysqli_num_fields($result); $i++){
                echo $row[$i] . " ";///in toàn bộ record thỏa điều kiện
            }
            echo "<br>";
        }
        //echo $row.":";
        
    }
}
//5. Xoa ket qua khoi vung nho va dong ket noi
mysqli_free_result($result);
mysqli_close($conn);

///

?>