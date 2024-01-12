import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarMetroComponent } from './listar-metro.component';

describe('ListarMetroComponent', () => {
  let component: ListarMetroComponent;
  let fixture: ComponentFixture<ListarMetroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListarMetroComponent]
    });
    fixture = TestBed.createComponent(ListarMetroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
