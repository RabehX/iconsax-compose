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

val Iconsax.Outline.CardReceive: ImageVector
    get() {
        if (_CardReceive != null) {
            return _CardReceive!!
        }
        _CardReceive = ImageVector.Builder(
            name = "Outline.CardReceive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 9.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2f, 7.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 7.75f, 15.25f, 8.09f, 15.25f, 8.5f)
                curveTo(15.25f, 8.91f, 14.91f, 9.25f, 14.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 17.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6f, 15.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 21.25f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 21.25f, 1.25f, 20.05f, 1.25f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.25f, 3.95f, 2.46f, 2.75f, 6.44f, 2.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 2.75f, 15.25f, 3.09f, 15.25f, 3.5f)
                curveTo(15.25f, 3.91f, 14.91f, 4.25f, 14.5f, 4.25f)
                horizontalLineTo(6.44f)
                curveTo(3.3f, 4.25f, 2.75f, 4.79f, 2.75f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2.75f, 19.2f, 3.3f, 19.74f, 6.44f, 19.74f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 19.74f, 21.24f, 19.2f, 21.24f, 16.1f)
                verticalLineTo(14.02f)
                curveTo(21.24f, 13.61f, 21.58f, 13.27f, 21.99f, 13.27f)
                curveTo(22.4f, 13.27f, 22.74f, 13.61f, 22.74f, 14.02f)
                verticalLineTo(16.1f)
                curveTo(22.75f, 20.05f, 21.54f, 21.25f, 17.56f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 10.25f)
                curveTo(19.9f, 10.25f, 19.81f, 10.23f, 19.71f, 10.19f)
                curveTo(19.43f, 10.07f, 19.25f, 9.8f, 19.25f, 9.5f)
                verticalLineTo(3.5f)
                curveTo(19.25f, 3.09f, 19.59f, 2.75f, 20f, 2.75f)
                curveTo(20.41f, 2.75f, 20.75f, 3.09f, 20.75f, 3.5f)
                verticalLineTo(7.69f)
                lineTo(21.47f, 6.97f)
                curveTo(21.76f, 6.68f, 22.24f, 6.68f, 22.53f, 6.97f)
                curveTo(22.82f, 7.26f, 22.82f, 7.74f, 22.53f, 8.03f)
                lineTo(20.53f, 10.03f)
                curveTo(20.39f, 10.17f, 20.2f, 10.25f, 20f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 10.25f)
                curveTo(19.809f, 10.25f, 19.619f, 10.18f, 19.469f, 10.03f)
                lineTo(17.469f, 8.03f)
                curveTo(17.18f, 7.74f, 17.18f, 7.26f, 17.469f, 6.97f)
                curveTo(17.76f, 6.68f, 18.24f, 6.68f, 18.529f, 6.97f)
                lineTo(20.529f, 8.97f)
                curveTo(20.819f, 9.26f, 20.819f, 9.74f, 20.529f, 10.03f)
                curveTo(20.379f, 10.18f, 20.19f, 10.25f, 20f, 10.25f)
                close()
            }
        }.build()

        return _CardReceive!!
    }

@Suppress("ObjectPropertyName")
private var _CardReceive: ImageVector? = null
