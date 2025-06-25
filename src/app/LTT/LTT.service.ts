import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface ActivityDTO {
  id: number;
  activityName: string;
}

@Injectable({ providedIn: 'root' })
export class LTTService {
  constructor(private http: HttpClient) {}

  getActivityList(): Observable<ActivityDTO[]> {
    return this.http.get<ActivityDTO[]>('http://localhost:8080/common/activityList');
  }
}
