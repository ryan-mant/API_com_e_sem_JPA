import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletarAtletaComponent } from './deletar-atleta.component';

describe('DeletarAtletaComponent', () => {
  let component: DeletarAtletaComponent;
  let fixture: ComponentFixture<DeletarAtletaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletarAtletaComponent]
    });
    fixture = TestBed.createComponent(DeletarAtletaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
