<?php
$lista = [
    ["numero" => 1],
    ["numero" => 2],
    ["numero"=> 3],
    ["numero"=> 4],
    ["numero"=> 5],
];

$somador == 0;
foreach ($lista as $item){
    $somador += $item['numero'];

    echo "<p>{$somador}</p>";
}
?>