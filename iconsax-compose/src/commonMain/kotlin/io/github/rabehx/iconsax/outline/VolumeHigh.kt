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

val Iconsax.Outline.VolumeHigh: ImageVector
    get() {
        if (_VolumeHigh != null) {
            return _VolumeHigh!!
        }
        _VolumeHigh = ImageVector.Builder(
            name = "Outline.VolumeHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.55f, 20.59f)
                curveTo(11.76f, 20.59f, 10.89f, 20.31f, 10.02f, 19.76f)
                lineTo(7.1f, 17.93f)
                curveTo(6.9f, 17.81f, 6.67f, 17.74f, 6.44f, 17.74f)
                horizontalLineTo(5f)
                curveTo(2.58f, 17.74f, 1.25f, 16.41f, 1.25f, 13.99f)
                verticalLineTo(9.99f)
                curveTo(1.25f, 7.57f, 2.58f, 6.24f, 5f, 6.24f)
                horizontalLineTo(6.43f)
                curveTo(6.66f, 6.24f, 6.89f, 6.17f, 7.09f, 6.05f)
                lineTo(10.01f, 4.22f)
                curveTo(11.47f, 3.31f, 12.89f, 3.14f, 14.01f, 3.76f)
                curveTo(15.13f, 4.38f, 15.74f, 5.67f, 15.74f, 7.4f)
                verticalLineTo(16.57f)
                curveTo(15.74f, 18.29f, 15.12f, 19.59f, 14.01f, 20.21f)
                curveTo(13.57f, 20.47f, 13.07f, 20.59f, 12.55f, 20.59f)
                close()
                moveTo(5f, 7.75f)
                curveTo(3.42f, 7.75f, 2.75f, 8.42f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 15.58f, 3.42f, 16.25f, 5f, 16.25f)
                horizontalLineTo(6.43f)
                curveTo(6.95f, 16.25f, 7.45f, 16.39f, 7.89f, 16.67f)
                lineTo(10.81f, 18.5f)
                curveTo(11.77f, 19.1f, 12.68f, 19.26f, 13.29f, 18.92f)
                curveTo(13.9f, 18.58f, 14.25f, 17.73f, 14.25f, 16.6f)
                verticalLineTo(7.41f)
                curveTo(14.25f, 6.27f, 13.9f, 5.42f, 13.29f, 5.09f)
                curveTo(12.68f, 4.75f, 11.77f, 4.9f, 10.81f, 5.51f)
                lineTo(7.88f, 7.33f)
                curveTo(7.45f, 7.61f, 6.94f, 7.75f, 6.43f, 7.75f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.75f)
                curveTo(17.84f, 16.75f, 17.69f, 16.7f, 17.55f, 16.6f)
                curveTo(17.22f, 16.35f, 17.15f, 15.88f, 17.4f, 15.55f)
                curveTo(18.97f, 13.46f, 18.97f, 10.54f, 17.4f, 8.45f)
                curveTo(17.15f, 8.12f, 17.22f, 7.65f, 17.55f, 7.4f)
                curveTo(17.88f, 7.15f, 18.35f, 7.22f, 18.6f, 7.55f)
                curveTo(20.56f, 10.17f, 20.56f, 13.83f, 18.6f, 16.45f)
                curveTo(18.45f, 16.65f, 18.23f, 16.75f, 18f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.83f, 19.25f)
                curveTo(19.67f, 19.25f, 19.52f, 19.2f, 19.38f, 19.1f)
                curveTo(19.05f, 18.85f, 18.98f, 18.38f, 19.23f, 18.05f)
                curveTo(21.9f, 14.49f, 21.9f, 9.51f, 19.23f, 5.95f)
                curveTo(18.98f, 5.62f, 19.05f, 5.15f, 19.38f, 4.9f)
                curveTo(19.71f, 4.65f, 20.18f, 4.72f, 20.43f, 5.05f)
                curveTo(23.5f, 9.14f, 23.5f, 14.86f, 20.43f, 18.95f)
                curveTo(20.29f, 19.15f, 20.06f, 19.25f, 19.83f, 19.25f)
                close()
            }
        }.build()

        return _VolumeHigh!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeHigh: ImageVector? = null
