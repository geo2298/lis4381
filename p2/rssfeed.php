<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<title>Using RSS Feeds - LIS 4381</title>
</head>

<body>
<?php
$url='http://feeds.bbci.co.uk/news/world/rss.xml';
$feed = simplexml_load_file($url, 'SimpleXMLIterator');
echo "<h2>".$feed->channel->description."</h2><ol>";

$filtered = new LimitIterator($feed->channel->item, 0, 10);
foreach ($filtered as $item) { ?>
<h4><li><a href="<?=$item->link; ?>" target="_blank"><?=$item->title;?></a></li></h4>
<?php
date_default_timezone_set('America/New_York');

$date = new DateTime($item->pubDate);
$date->setTimeZone(new DateTimeZone('America/New_York'));
$offset = $date->getOffset();
$timezone = ($offset == -14400) ? ' EDT': ' EDT';
echo $date->format('M j, Y, g:ia') . $timezone;
?>
	<p><?php echo $item->description; ?></p>
<?php } ?>

	</ol>
	</body>
	</html>