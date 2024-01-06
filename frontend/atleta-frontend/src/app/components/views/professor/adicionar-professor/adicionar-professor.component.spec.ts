import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarProfessorComponent } from './adicionar-professor.component';

describe('AdicionarProfessorComponent', () => {
  let component: AdicionarProfessorComponent;
  let fixture: ComponentFixture<AdicionarProfessorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarProfessorComponent]
    });
    fixture = TestBed.createComponent(AdicionarProfessorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
