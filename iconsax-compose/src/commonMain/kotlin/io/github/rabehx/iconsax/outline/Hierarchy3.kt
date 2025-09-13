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

val Iconsax.Outline.Hierarchy3: ImageVector
    get() {
        if (_Hierarchy3 != null) {
            return _Hierarchy3!!
        }
        _Hierarchy3 = ImageVector.Builder(
            name = "Outline.Hierarchy3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 15.75f)
                curveTo(16.93f, 15.75f, 15.25f, 14.07f, 15.25f, 12f)
                curveTo(15.25f, 9.93f, 16.93f, 8.25f, 19f, 8.25f)
                curveTo(21.07f, 8.25f, 22.75f, 9.93f, 22.75f, 12f)
                curveTo(22.75f, 14.07f, 21.07f, 15.75f, 19f, 15.75f)
                close()
                moveTo(19f, 9.75f)
                curveTo(17.76f, 9.75f, 16.75f, 10.76f, 16.75f, 12f)
                curveTo(16.75f, 13.24f, 17.76f, 14.25f, 19f, 14.25f)
                curveTo(20.24f, 14.25f, 21.25f, 13.24f, 21.25f, 12f)
                curveTo(21.25f, 10.76f, 20.24f, 9.75f, 19f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.75f)
                curveTo(2.93f, 22.75f, 1.25f, 21.07f, 1.25f, 19f)
                curveTo(1.25f, 16.93f, 2.93f, 15.25f, 5f, 15.25f)
                curveTo(7.07f, 15.25f, 8.75f, 16.93f, 8.75f, 19f)
                curveTo(8.75f, 21.07f, 7.07f, 22.75f, 5f, 22.75f)
                close()
                moveTo(5f, 16.75f)
                curveTo(3.76f, 16.75f, 2.75f, 17.76f, 2.75f, 19f)
                curveTo(2.75f, 20.24f, 3.76f, 21.25f, 5f, 21.25f)
                curveTo(6.24f, 21.25f, 7.25f, 20.24f, 7.25f, 19f)
                curveTo(7.25f, 17.76f, 6.24f, 16.75f, 5f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 16.75f)
                curveTo(4.59f, 16.75f, 4.25f, 16.41f, 4.25f, 16f)
                verticalLineTo(8f)
                curveTo(4.25f, 7.59f, 4.59f, 7.25f, 5f, 7.25f)
                curveTo(5.41f, 7.25f, 5.75f, 7.59f, 5.75f, 8f)
                curveTo(5.75f, 10.19f, 6.81f, 11.25f, 9f, 11.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16f, 12.75f)
                horizontalLineTo(9f)
                curveTo(7.64f, 12.75f, 6.55f, 12.4f, 5.75f, 11.74f)
                verticalLineTo(16f)
                curveTo(5.75f, 16.41f, 5.41f, 16.75f, 5f, 16.75f)
                close()
            }
        }.build()

        return _Hierarchy3!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy3: ImageVector? = null
