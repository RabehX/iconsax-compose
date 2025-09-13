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

val Iconsax.Outline.Simcard: ImageVector
    get() {
        if (_Simcard != null) {
            return _Simcard!!
        }
        _Simcard = ImageVector.Builder(
            name = "Outline.Simcard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.56f, 22.75f, 2.25f, 20.44f, 2.25f, 17f)
                verticalLineTo(7f)
                curveTo(2.25f, 3.56f, 4.56f, 1.25f, 8f, 1.25f)
                horizontalLineTo(12.93f)
                curveTo(14.47f, 1.25f, 15.91f, 1.85f, 17f, 2.93f)
                lineTo(20.07f, 6f)
                curveTo(21.16f, 7.09f, 21.75f, 8.53f, 21.75f, 10.07f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.44f, 19.44f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(5.42f, 2.75f, 3.75f, 4.42f, 3.75f, 7f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.58f, 5.42f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.58f, 21.25f, 20.25f, 19.58f, 20.25f, 17f)
                verticalLineTo(10.07f)
                curveTo(20.25f, 8.94f, 19.81f, 7.87f, 19f, 7.06f)
                lineTo(15.93f, 4f)
                curveTo(15.13f, 3.2f, 14.06f, 2.75f, 12.92f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 19.25f)
                horizontalLineTo(10f)
                curveTo(7.93f, 19.25f, 6.25f, 17.57f, 6.25f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(6.25f, 10.43f, 7.93f, 8.75f, 10f, 8.75f)
                horizontalLineTo(14f)
                curveTo(16.07f, 8.75f, 17.75f, 10.43f, 17.75f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(17.75f, 17.57f, 16.07f, 19.25f, 14f, 19.25f)
                close()
                moveTo(10f, 10.25f)
                curveTo(8.76f, 10.25f, 7.75f, 11.26f, 7.75f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(7.75f, 16.74f, 8.76f, 17.75f, 10f, 17.75f)
                horizontalLineTo(14f)
                curveTo(15.24f, 17.75f, 16.25f, 16.74f, 16.25f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(16.25f, 11.26f, 15.24f, 10.25f, 14f, 10.25f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.25f)
                curveTo(11.59f, 19.25f, 11.25f, 18.91f, 11.25f, 18.5f)
                verticalLineTo(9.5f)
                curveTo(11.25f, 9.09f, 11.59f, 8.75f, 12f, 8.75f)
                curveTo(12.41f, 8.75f, 12.75f, 9.09f, 12.75f, 9.5f)
                verticalLineTo(18.5f)
                curveTo(12.75f, 18.91f, 12.41f, 19.25f, 12f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 14.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 14.75f, 6.75f, 14.41f, 6.75f, 14f)
                curveTo(6.75f, 13.59f, 7.09f, 13.25f, 7.5f, 13.25f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 13.25f, 17.25f, 13.59f, 17.25f, 14f)
                curveTo(17.25f, 14.41f, 16.91f, 14.75f, 16.5f, 14.75f)
                close()
            }
        }.build()

        return _Simcard!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard: ImageVector? = null
