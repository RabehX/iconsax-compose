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

val Iconsax.Outline.GasStation: ImageVector
    get() {
        if (_GasStation != null) {
            return _GasStation!!
        }
        _GasStation = ImageVector.Builder(
            name = "Outline.GasStation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 22.75f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 22.75f, 2.75f, 22.41f, 2.75f, 22f)
                verticalLineTo(5f)
                curveTo(2.75f, 2.76f, 4.26f, 1.25f, 6.5f, 1.25f)
                horizontalLineTo(14.5f)
                curveTo(16.74f, 1.25f, 18.25f, 2.76f, 18.25f, 5f)
                verticalLineTo(22f)
                curveTo(18.25f, 22.41f, 17.91f, 22.75f, 17.5f, 22.75f)
                close()
                moveTo(4.25f, 21.25f)
                horizontalLineTo(16.75f)
                verticalLineTo(5f)
                curveTo(16.75f, 3.59f, 15.91f, 2.75f, 14.5f, 2.75f)
                horizontalLineTo(6.5f)
                curveTo(5.09f, 2.75f, 4.25f, 3.59f, 4.25f, 5f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 21.25f, 19.75f, 21.59f, 19.75f, 22f)
                curveTo(19.75f, 22.41f, 19.41f, 22.75f, 19f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.61f, 10.75f)
                horizontalLineTo(8.38f)
                curveTo(6.75f, 10.75f, 5.74f, 9.74f, 5.74f, 8.11f)
                verticalLineTo(6.88f)
                curveTo(5.74f, 5.25f, 6.75f, 4.24f, 8.38f, 4.24f)
                horizontalLineTo(12.61f)
                curveTo(14.24f, 4.24f, 15.25f, 5.25f, 15.25f, 6.88f)
                verticalLineTo(8.11f)
                curveTo(15.25f, 9.74f, 14.24f, 10.75f, 12.61f, 10.75f)
                close()
                moveTo(8.39f, 5.75f)
                curveTo(7.58f, 5.75f, 7.25f, 6.08f, 7.25f, 6.89f)
                verticalLineTo(8.12f)
                curveTo(7.25f, 8.93f, 7.58f, 9.26f, 8.39f, 9.26f)
                horizontalLineTo(12.62f)
                curveTo(13.43f, 9.26f, 13.76f, 8.93f, 13.76f, 8.12f)
                verticalLineTo(6.89f)
                curveTo(13.76f, 6.08f, 13.43f, 5.75f, 12.62f, 5.75f)
                horizontalLineTo(8.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 13.75f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 13.75f, 5.75f, 13.41f, 5.75f, 13f)
                curveTo(5.75f, 12.59f, 6.09f, 12.25f, 6.5f, 12.25f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 12.25f, 10.25f, 12.59f, 10.25f, 13f)
                curveTo(10.25f, 13.41f, 9.91f, 13.75f, 9.5f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 16.76f)
                curveTo(17.09f, 16.76f, 16.75f, 16.43f, 16.75f, 16.01f)
                curveTo(16.75f, 15.6f, 17.08f, 15.26f, 17.5f, 15.26f)
                lineTo(21.25f, 15.25f)
                verticalLineTo(10.46f)
                lineTo(19.66f, 9.67f)
                curveTo(19.29f, 9.48f, 19.14f, 9.03f, 19.32f, 8.66f)
                curveTo(19.51f, 8.29f, 19.96f, 8.14f, 20.33f, 8.32f)
                lineTo(22.33f, 9.32f)
                curveTo(22.58f, 9.45f, 22.74f, 9.71f, 22.74f, 9.99f)
                verticalLineTo(15.99f)
                curveTo(22.74f, 16.4f, 22.41f, 16.74f, 21.99f, 16.74f)
                lineTo(17.5f, 16.76f)
                close()
            }
        }.build()

        return _GasStation!!
    }

@Suppress("ObjectPropertyName")
private var _GasStation: ImageVector? = null
