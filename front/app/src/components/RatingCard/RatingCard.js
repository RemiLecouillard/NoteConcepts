import React from 'react';
import Rating from '@material-ui/lab/Rating';
import StarBorderIcon from '@material-ui/icons/StarBorder';
import LanguageIcon from '@material-ui/icons/Language';
import { makeStyles } from '@material-ui/core/styles';
import Collapse from '@material-ui/core/Collapse';
import Card from '@material-ui/core/Card';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Typography from '@material-ui/core/Typography';

const useStyles = makeStyles({
  root: {
    maxWidth: 500,
  },
});

export default function RatingCard({
    concept,
    description,
    image_url,
    mean
}) {
  const classes = useStyles();
  const [rated, setRated] = React.useState(false);

  const handleChange = () => {
    setRated((prev) => true);
  };


  return (
    <Card className={classes.root} variant="outlined">
        <CardMedia
          component="img"
          alt={concept}
          height="200"
          image={image_url?image_url:"star.svg"}
          title={concept}
        />
        <CardContent>
          <Typography gutterBottom variant="h4">
              {concept}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
            {description}
          </Typography>
          <Rating
          name={concept+"-rating"}
          onChange={handleChange}
          defaultValue={0}
          precision={1}
          emptyIcon={<StarBorderIcon fontSize="inherit" />}
          />
          <Collapse in={rated}>
            <Rating
            disabled
            name={concept+"-rating"}
            value={mean}
            precision={0.1}
            emptyIcon={<LanguageIcon fontSize="inherit"/>}
            icon={<LanguageIcon fontSize="inherit"/>}
            />            
          </Collapse>
        </CardContent>
        

    </Card>
  );
}
