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


val Iconsax.Filled.DocumentCode2: ImageVector
    get() {
        if (_DocumentCode2 != null) {
            return _DocumentCode2!!
        }
        _DocumentCode2 = ImageVector.Builder(
            name = "Filled.DocumentCode2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4.5f, 2f, 3f, 4f, 3f, 7f)
                verticalLineTo(11.47f)
                curveTo(3f, 11.82f, 3.34f, 12.06f, 3.66f, 11.94f)
                curveTo(4.76f, 11.51f, 6.01f, 11.37f, 7.3f, 11.63f)
                curveTo(9.9f, 12.15f, 11.97f, 14.29f, 12.4f, 16.9f)
                curveTo(12.66f, 18.49f, 12.34f, 20f, 11.61f, 21.25f)
                curveTo(11.41f, 21.58f, 11.65f, 22f, 12.04f, 22f)
                horizontalLineTo(16f)
                curveTo(19.5f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(7f)
                curveTo(21f, 4f, 19.5f, 2f, 16f, 2f)
                close()
                moveTo(18.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(14.98f, 9.25f, 13.75f, 8.02f, 13.75f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(13.75f, 4.09f, 14.09f, 3.75f, 14.5f, 3.75f)
                curveTo(14.91f, 3.75f, 15.25f, 4.09f, 15.25f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(15.25f, 7.19f, 15.81f, 7.75f, 16.5f, 7.75f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 7.75f, 19.25f, 8.09f, 19.25f, 8.5f)
                curveTo(19.25f, 8.91f, 18.91f, 9.25f, 18.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 13f)
                curveTo(3.24f, 13f, 1f, 15.24f, 1f, 18f)
                curveTo(1f, 20.76f, 3.24f, 23f, 6f, 23f)
                curveTo(8.76f, 23f, 11f, 20.76f, 11f, 18f)
                curveTo(11f, 15.24f, 8.76f, 13f, 6f, 13f)
                close()
                moveTo(5.16f, 19.27f)
                curveTo(5.41f, 19.52f, 5.41f, 19.93f, 5.16f, 20.19f)
                curveTo(5.03f, 20.32f, 4.87f, 20.38f, 4.7f, 20.38f)
                curveTo(4.53f, 20.38f, 4.37f, 20.32f, 4.24f, 20.19f)
                lineTo(2.51f, 18.46f)
                curveTo(2.26f, 18.21f, 2.26f, 17.8f, 2.51f, 17.54f)
                lineTo(4.24f, 15.81f)
                curveTo(4.49f, 15.56f, 4.9f, 15.56f, 5.16f, 15.81f)
                curveTo(5.41f, 16.06f, 5.41f, 16.47f, 5.16f, 16.73f)
                lineTo(3.89f, 18f)
                lineTo(5.16f, 19.27f)
                close()
                moveTo(9.48f, 18.46f)
                lineTo(7.75f, 20.19f)
                curveTo(7.62f, 20.32f, 7.46f, 20.38f, 7.29f, 20.38f)
                curveTo(7.12f, 20.38f, 6.96f, 20.32f, 6.83f, 20.19f)
                curveTo(6.58f, 19.94f, 6.58f, 19.53f, 6.83f, 19.27f)
                lineTo(8.11f, 18f)
                lineTo(6.84f, 16.73f)
                curveTo(6.59f, 16.48f, 6.59f, 16.07f, 6.84f, 15.81f)
                curveTo(7.09f, 15.56f, 7.5f, 15.56f, 7.76f, 15.81f)
                lineTo(9.49f, 17.54f)
                curveTo(9.73f, 17.8f, 9.73f, 18.2f, 9.48f, 18.46f)
                close()
            }
        }.build()

        return _DocumentCode2!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCode2: ImageVector? = null
