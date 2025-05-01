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


val Iconsax.Filled.HashtagUp: ImageVector
    get() {
        if (_HashtagUp != null) {
            return _HashtagUp!!
        }
        _HashtagUp = ImageVector.Builder(
            name = "Filled.HashtagUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.08f, 11.832f)
                horizontalLineTo(11.73f)
                lineTo(11.92f, 10.172f)
                horizontalLineTo(10.27f)
                lineTo(10.08f, 11.832f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.97f, 7.21f)
                curveTo(21.77f, 4.13f, 19.87f, 2.23f, 16.79f, 2.03f)
                curveTo(16.59f, 2.01f, 16.39f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 2f, 7.41f, 2.01f, 7.21f, 2.03f)
                curveTo(4.13f, 2.23f, 2.23f, 4.13f, 2.03f, 7.21f)
                curveTo(2.01f, 7.41f, 2f, 7.61f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 16.39f, 2.01f, 16.59f, 2.03f, 16.79f)
                curveTo(2.23f, 19.87f, 4.13f, 21.77f, 7.21f, 21.97f)
                curveTo(7.41f, 21.99f, 7.61f, 22f, 7.81f, 22f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 22f, 14.5f, 21.55f, 14.5f, 21f)
                verticalLineTo(18.03f)
                curveTo(14.5f, 16.08f, 16.08f, 14.5f, 18.03f, 14.5f)
                horizontalLineTo(21f)
                curveTo(21.55f, 14.5f, 22f, 14.05f, 22f, 13.5f)
                verticalLineTo(7.81f)
                curveTo(22f, 7.61f, 21.99f, 7.41f, 21.97f, 7.21f)
                close()
                moveTo(16f, 10.17f)
                horizontalLineTo(13.43f)
                lineTo(13.24f, 11.83f)
                horizontalLineTo(15.47f)
                curveTo(15.89f, 11.83f, 16.22f, 12.17f, 16.22f, 12.58f)
                curveTo(16.22f, 12.99f, 15.89f, 13.33f, 15.47f, 13.33f)
                horizontalLineTo(13.08f)
                lineTo(12.8f, 15.82f)
                curveTo(12.76f, 16.2f, 12.43f, 16.49f, 12.05f, 16.49f)
                curveTo(12.03f, 16.49f, 12f, 16.49f, 11.97f, 16.48f)
                curveTo(11.56f, 16.44f, 11.26f, 16.07f, 11.31f, 15.65f)
                lineTo(11.57f, 13.33f)
                horizontalLineTo(9.92f)
                lineTo(9.64f, 15.82f)
                curveTo(9.6f, 16.2f, 9.27f, 16.49f, 8.9f, 16.49f)
                curveTo(8.87f, 16.49f, 8.84f, 16.49f, 8.81f, 16.48f)
                curveTo(8.4f, 16.44f, 8.1f, 16.07f, 8.15f, 15.65f)
                lineTo(8.41f, 13.33f)
                horizontalLineTo(6f)
                curveTo(5.59f, 13.33f, 5.25f, 12.99f, 5.25f, 12.58f)
                curveTo(5.25f, 12.17f, 5.59f, 11.83f, 6f, 11.83f)
                horizontalLineTo(8.57f)
                lineTo(8.76f, 10.17f)
                horizontalLineTo(6.53f)
                curveTo(6.11f, 10.17f, 5.78f, 9.83f, 5.78f, 9.42f)
                curveTo(5.78f, 9.01f, 6.11f, 8.67f, 6.53f, 8.67f)
                horizontalLineTo(8.92f)
                lineTo(9.2f, 6.18f)
                curveTo(9.25f, 5.77f, 9.62f, 5.47f, 10.03f, 5.52f)
                curveTo(10.44f, 5.56f, 10.74f, 5.93f, 10.69f, 6.35f)
                lineTo(10.43f, 8.67f)
                horizontalLineTo(12.08f)
                lineTo(12.36f, 6.18f)
                curveTo(12.41f, 5.77f, 12.78f, 5.47f, 13.19f, 5.52f)
                curveTo(13.6f, 5.56f, 13.9f, 5.93f, 13.85f, 6.35f)
                lineTo(13.59f, 8.67f)
                horizontalLineTo(16f)
                curveTo(16.41f, 8.67f, 16.75f, 9.01f, 16.75f, 9.42f)
                curveTo(16.75f, 9.83f, 16.41f, 10.17f, 16f, 10.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.97f, 16f)
                horizontalLineTo(18.03f)
                curveTo(16.76f, 16f, 16f, 16.76f, 16f, 18.03f)
                verticalLineTo(20.97f)
                curveTo(16f, 22.24f, 16.76f, 23f, 18.03f, 23f)
                horizontalLineTo(20.97f)
                curveTo(22.24f, 23f, 23f, 22.24f, 23f, 20.97f)
                verticalLineTo(18.03f)
                curveTo(23f, 16.76f, 22.24f, 16f, 20.97f, 16f)
                close()
                moveTo(21.19f, 19.31f)
                curveTo(21.07f, 19.43f, 20.91f, 19.49f, 20.75f, 19.49f)
                curveTo(20.59f, 19.49f, 20.43f, 19.43f, 20.31f, 19.31f)
                lineTo(20.13f, 19.13f)
                verticalLineTo(21.37f)
                curveTo(20.13f, 21.72f, 19.85f, 22f, 19.5f, 22f)
                curveTo(19.15f, 22f, 18.87f, 21.72f, 18.87f, 21.37f)
                verticalLineTo(19.13f)
                lineTo(18.69f, 19.31f)
                curveTo(18.45f, 19.55f, 18.05f, 19.55f, 17.81f, 19.31f)
                curveTo(17.57f, 19.07f, 17.57f, 18.67f, 17.81f, 18.43f)
                lineTo(19.06f, 17.18f)
                curveTo(19.11f, 17.13f, 19.18f, 17.09f, 19.25f, 17.06f)
                curveTo(19.27f, 17.05f, 19.29f, 17.05f, 19.31f, 17.04f)
                curveTo(19.36f, 17.02f, 19.41f, 17.01f, 19.47f, 17.01f)
                curveTo(19.49f, 17.01f, 19.51f, 17.01f, 19.53f, 17.01f)
                curveTo(19.6f, 17.01f, 19.66f, 17.02f, 19.73f, 17.05f)
                curveTo(19.74f, 17.05f, 19.74f, 17.05f, 19.75f, 17.05f)
                curveTo(19.82f, 17.08f, 19.88f, 17.12f, 19.93f, 17.17f)
                curveTo(19.94f, 17.18f, 19.94f, 17.18f, 19.95f, 17.18f)
                lineTo(21.2f, 18.43f)
                curveTo(21.44f, 18.67f, 21.44f, 19.07f, 21.19f, 19.31f)
                close()
            }
        }.build()

        return _HashtagUp!!
    }

@Suppress("ObjectPropertyName")
private var _HashtagUp: ImageVector? = null
