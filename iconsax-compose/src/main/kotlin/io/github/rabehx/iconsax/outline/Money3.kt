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

val Iconsax.Outline.Money3: ImageVector
    get() {
        if (_Money3 != null) {
            return _Money3!!
        }
        _Money3 = ImageVector.Builder(
            name = "Outline.Money3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.25f)
                horizontalLineTo(7f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7f, 2.75f)
                horizontalLineTo(17f)
                curveTo(20.65f, 2.75f, 22.75f, 4.85f, 22.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17f, 21.25f)
                close()
                moveTo(7f, 4.25f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7f, 19.75f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(21.25f, 5.64f, 19.86f, 4.25f, 17f, 4.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12f, 15.75f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 7.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 7.75f, 15.25f, 7.41f, 15.25f, 7f)
                curveTo(15.25f, 6.59f, 15.59f, 6.25f, 16f, 6.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 6.25f, 19.75f, 6.59f, 19.75f, 7f)
                curveTo(19.75f, 7.41f, 19.41f, 7.75f, 19f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 17.75f)
                horizontalLineTo(5f)
                curveTo(4.59f, 17.75f, 4.25f, 17.41f, 4.25f, 17f)
                curveTo(4.25f, 16.59f, 4.59f, 16.25f, 5f, 16.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 16.25f, 8.75f, 16.59f, 8.75f, 17f)
                curveTo(8.75f, 17.41f, 8.41f, 17.75f, 8f, 17.75f)
                close()
            }
        }.build()

        return _Money3!!
    }

@Suppress("ObjectPropertyName")
private var _Money3: ImageVector? = null
