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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.DocumentForward: ImageVector
    get() {
        if (_DocumentForward != null) {
            return _DocumentForward!!
        }
        _DocumentForward = ImageVector.Builder(
            name = "Filled.DocumentForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3f)
                curveTo(13.31f, 2.45f, 12.86f, 2f, 12.31f, 2f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2f, 2.5f, 4f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20f, 4.99f, 22f, 8.07f, 22f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22f, 21.5f, 20f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
                moveTo(13.75f, 14.94f)
                curveTo(13.75f, 14.99f, 13.75f, 15.05f, 13.75f, 15.1f)
                curveTo(13.73f, 15.24f, 13.67f, 15.37f, 13.57f, 15.49f)
                curveTo(13.56f, 15.5f, 13.54f, 15.52f, 13.53f, 15.53f)
                lineTo(11.53f, 17.53f)
                curveTo(11.38f, 17.68f, 11.19f, 17.75f, 11f, 17.75f)
                curveTo(10.81f, 17.75f, 10.62f, 17.68f, 10.47f, 17.53f)
                curveTo(10.18f, 17.24f, 10.18f, 16.76f, 10.47f, 16.47f)
                lineTo(11.19f, 15.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 15.75f, 6.25f, 15.41f, 6.25f, 15f)
                curveTo(6.25f, 14.59f, 6.59f, 14.25f, 7f, 14.25f)
                horizontalLineTo(11.19f)
                lineTo(10.47f, 13.53f)
                curveTo(10.32f, 13.38f, 10.25f, 13.19f, 10.25f, 13f)
                curveTo(10.25f, 12.81f, 10.32f, 12.62f, 10.47f, 12.47f)
                curveTo(10.76f, 12.18f, 11.24f, 12.18f, 11.53f, 12.47f)
                lineTo(13.53f, 14.47f)
                curveTo(13.66f, 14.61f, 13.73f, 14.77f, 13.75f, 14.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.43f, 8.81f)
                curveTo(18.38f, 8.82f, 19.7f, 8.82f, 20.83f, 8.82f)
                curveTo(21.4f, 8.82f, 21.7f, 8.15f, 21.3f, 7.75f)
                curveTo(19.86f, 6.3f, 17.28f, 3.69f, 15.8f, 2.21f)
                curveTo(15.39f, 1.8f, 14.68f, 2.08f, 14.68f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.68f, 7.6f, 15.92f, 8.81f, 17.43f, 8.81f)
                close()
            }
        }.build()

        return _DocumentForward!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentForward: ImageVector? = null
