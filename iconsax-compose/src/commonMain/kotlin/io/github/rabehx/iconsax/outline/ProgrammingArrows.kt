/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ProgrammingArrows: ImageVector
    get() {
        if (_ProgrammingArrows != null) {
            return _ProgrammingArrows!!
        }
        _ProgrammingArrows = ImageVector.Builder(
            name = "Outline.ProgrammingArrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 16.75f)
                curveTo(18.59f, 16.75f, 18.25f, 16.41f, 18.25f, 16f)
                verticalLineTo(6.5f)
                curveTo(18.25f, 5.81f, 17.69f, 5.25f, 17f, 5.25f)
                horizontalLineTo(11.5f)
                curveTo(11.09f, 5.25f, 10.75f, 4.91f, 10.75f, 4.5f)
                curveTo(10.75f, 4.09f, 11.09f, 3.75f, 11.5f, 3.75f)
                horizontalLineTo(17f)
                curveTo(18.52f, 3.75f, 19.75f, 4.98f, 19.75f, 6.5f)
                verticalLineTo(16f)
                curveTo(19.75f, 16.41f, 19.41f, 16.75f, 19f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 7.75f)
                curveTo(13.83f, 7.75f, 13.66f, 7.69f, 13.52f, 7.58f)
                lineTo(10.52f, 5.08f)
                curveTo(10.35f, 4.94f, 10.25f, 4.73f, 10.25f, 4.5f)
                curveTo(10.25f, 4.27f, 10.35f, 4.07f, 10.52f, 3.92f)
                lineTo(13.52f, 1.42f)
                curveTo(13.84f, 1.15f, 14.31f, 1.2f, 14.58f, 1.52f)
                curveTo(14.85f, 1.84f, 14.8f, 2.31f, 14.48f, 2.58f)
                lineTo(12.17f, 4.5f)
                lineTo(14.48f, 6.42f)
                curveTo(14.8f, 6.69f, 14.84f, 7.16f, 14.58f, 7.48f)
                curveTo(14.43f, 7.66f, 14.21f, 7.75f, 14f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(16.93f, 22.75f, 15.25f, 21.07f, 15.25f, 19f)
                curveTo(15.25f, 16.93f, 16.93f, 15.25f, 19f, 15.25f)
                curveTo(21.07f, 15.25f, 22.75f, 16.93f, 22.75f, 19f)
                curveTo(22.75f, 21.07f, 21.07f, 22.75f, 19f, 22.75f)
                close()
                moveTo(19f, 16.75f)
                curveTo(17.76f, 16.75f, 16.75f, 17.76f, 16.75f, 19f)
                curveTo(16.75f, 20.24f, 17.76f, 21.25f, 19f, 21.25f)
                curveTo(20.24f, 21.25f, 21.25f, 20.24f, 21.25f, 19f)
                curveTo(21.25f, 17.76f, 20.24f, 16.75f, 19f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 20.25f)
                horizontalLineTo(7f)
                curveTo(5.48f, 20.25f, 4.25f, 19.02f, 4.25f, 17.5f)
                verticalLineTo(8f)
                curveTo(4.25f, 7.59f, 4.59f, 7.25f, 5f, 7.25f)
                curveTo(5.41f, 7.25f, 5.75f, 7.59f, 5.75f, 8f)
                verticalLineTo(17.5f)
                curveTo(5.75f, 18.19f, 6.31f, 18.75f, 7f, 18.75f)
                horizontalLineTo(12.5f)
                curveTo(12.91f, 18.75f, 13.25f, 19.09f, 13.25f, 19.5f)
                curveTo(13.25f, 19.91f, 12.91f, 20.25f, 12.5f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.001f, 22.75f)
                curveTo(9.791f, 22.75f, 9.571f, 22.66f, 9.421f, 22.48f)
                curveTo(9.151f, 22.16f, 9.201f, 21.69f, 9.521f, 21.42f)
                lineTo(11.831f, 19.5f)
                lineTo(9.521f, 17.58f)
                curveTo(9.201f, 17.31f, 9.161f, 16.84f, 9.421f, 16.52f)
                curveTo(9.691f, 16.2f, 10.161f, 16.16f, 10.481f, 16.42f)
                lineTo(13.481f, 18.92f)
                curveTo(13.651f, 19.06f, 13.751f, 19.27f, 13.751f, 19.5f)
                curveTo(13.751f, 19.73f, 13.651f, 19.93f, 13.481f, 20.08f)
                lineTo(10.481f, 22.58f)
                curveTo(10.341f, 22.69f, 10.171f, 22.75f, 10.001f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8.75f)
                curveTo(2.93f, 8.75f, 1.25f, 7.07f, 1.25f, 5f)
                curveTo(1.25f, 2.93f, 2.93f, 1.25f, 5f, 1.25f)
                curveTo(7.07f, 1.25f, 8.75f, 2.93f, 8.75f, 5f)
                curveTo(8.75f, 7.07f, 7.07f, 8.75f, 5f, 8.75f)
                close()
                moveTo(5f, 2.75f)
                curveTo(3.76f, 2.75f, 2.75f, 3.76f, 2.75f, 5f)
                curveTo(2.75f, 6.24f, 3.76f, 7.25f, 5f, 7.25f)
                curveTo(6.24f, 7.25f, 7.25f, 6.24f, 7.25f, 5f)
                curveTo(7.25f, 3.76f, 6.24f, 2.75f, 5f, 2.75f)
                close()
            }
        }.build()

        return _ProgrammingArrows!!
    }

@Suppress("ObjectPropertyName")
private var _ProgrammingArrows: ImageVector? = null
