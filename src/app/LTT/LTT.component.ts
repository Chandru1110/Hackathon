import { Component } from '@angular/core';
import { LTTService, ActivityDTO } from './LTT.service';

@Component({
  selector: 'app-ltt',
  templateUrl: './LTT.component.html',
  styleUrls: ['./LTT.component.scss']
})
export class LTTComponent {
  activities: ActivityDTO[] = [];
  constructor(private lttService: LTTService) {}

  fetchActivities() {
    this.lttService.getActivityList().subscribe(data => {
      console.log('Fetched activities:', data);
      this.activities = data;
    });
  }
}
