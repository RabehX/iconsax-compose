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

val Iconsax.Outline.TagUser: ImageVector
    get() {
        if (_TagUser != null) {
            return _TagUser!!
        }
        _TagUser = ImageVector.Builder(
            name = "Outline.TagUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.3f, 22.75f, 10.59f, 22.48f, 10.06f, 21.95f)
                lineTo(8.35f, 20.26f)
                curveTo(7.93f, 19.84f, 7.35f, 19.61f, 6.76f, 19.61f)
                horizontalLineTo(6f)
                curveTo(3.93f, 19.61f, 2.25f, 17.94f, 2.25f, 15.89f)
                verticalLineTo(4.97f)
                curveTo(2.25f, 2.92f, 3.93f, 1.25f, 6f, 1.25f)
                horizontalLineTo(18f)
                curveTo(20.07f, 1.25f, 21.75f, 2.92f, 21.75f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(21.75f, 17.93f, 20.07f, 19.6f, 18f, 19.6f)
                horizontalLineTo(17.24f)
                curveTo(16.65f, 19.6f, 16.07f, 19.84f, 15.65f, 20.25f)
                lineTo(13.94f, 21.94f)
                curveTo(13.41f, 22.48f, 12.7f, 22.75f, 12f, 22.75f)
                close()
                moveTo(6f, 2.75f)
                curveTo(4.76f, 2.75f, 3.75f, 3.75f, 3.75f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3.75f, 17.11f, 4.76f, 18.1f, 6f, 18.1f)
                horizontalLineTo(6.76f)
                curveTo(7.75f, 18.1f, 8.71f, 18.5f, 9.41f, 19.19f)
                lineTo(11.12f, 20.88f)
                curveTo(11.61f, 21.36f, 12.4f, 21.36f, 12.89f, 20.88f)
                lineTo(14.6f, 19.19f)
                curveTo(15.3f, 18.5f, 16.26f, 18.1f, 17.25f, 18.1f)
                horizontalLineTo(18f)
                curveTo(19.24f, 18.1f, 20.25f, 17.1f, 20.25f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(20.25f, 3.74f, 19.24f, 2.75f, 18f, 2.75f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.071f, 9.7f)
                curveTo(12.051f, 9.7f, 12.021f, 9.7f, 12.001f, 9.7f)
                curveTo(11.971f, 9.7f, 11.931f, 9.7f, 11.901f, 9.7f)
                curveTo(10.441f, 9.65f, 9.301f, 8.47f, 9.301f, 7f)
                curveTo(9.301f, 5.51f, 10.511f, 4.3f, 12.001f, 4.3f)
                curveTo(13.491f, 4.3f, 14.701f, 5.51f, 14.701f, 7f)
                curveTo(14.691f, 8.47f, 13.551f, 9.65f, 12.091f, 9.7f)
                curveTo(12.091f, 9.7f, 12.081f, 9.7f, 12.071f, 9.7f)
                close()
                moveTo(12.001f, 5.8f)
                curveTo(11.341f, 5.8f, 10.801f, 6.34f, 10.801f, 7f)
                curveTo(10.801f, 7.65f, 11.311f, 8.18f, 11.951f, 8.2f)
                curveTo(11.951f, 8.19f, 12.011f, 8.19f, 12.081f, 8.2f)
                curveTo(12.711f, 8.16f, 13.201f, 7.64f, 13.201f, 7f)
                curveTo(13.201f, 6.34f, 12.661f, 5.8f, 12.001f, 5.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.7f)
                curveTo(10.86f, 16.7f, 9.72f, 16.4f, 8.83f, 15.81f)
                curveTo(7.99f, 15.25f, 7.5f, 14.44f, 7.5f, 13.58f)
                curveTo(7.5f, 12.72f, 7.98f, 11.9f, 8.83f, 11.34f)
                curveTo(10.61f, 10.16f, 13.39f, 10.16f, 15.16f, 11.34f)
                curveTo(16f, 11.9f, 16.49f, 12.72f, 16.49f, 13.57f)
                curveTo(16.49f, 14.43f, 16.01f, 15.24f, 15.16f, 15.81f)
                curveTo(14.28f, 16.41f, 13.14f, 16.7f, 12f, 16.7f)
                close()
                moveTo(9.66f, 12.59f)
                curveTo(9.23f, 12.88f, 9f, 13.23f, 9f, 13.58f)
                curveTo(9f, 13.93f, 9.24f, 14.28f, 9.66f, 14.57f)
                curveTo(10.93f, 15.42f, 13.06f, 15.42f, 14.33f, 14.57f)
                curveTo(14.76f, 14.28f, 15f, 13.93f, 14.99f, 13.58f)
                curveTo(14.99f, 13.23f, 14.75f, 12.88f, 14.33f, 12.59f)
                curveTo(13.07f, 11.74f, 10.93f, 11.74f, 9.66f, 12.59f)
                close()
            }
        }.build()

        return _TagUser!!
    }

@Suppress("ObjectPropertyName")
private var _TagUser: ImageVector? = null
