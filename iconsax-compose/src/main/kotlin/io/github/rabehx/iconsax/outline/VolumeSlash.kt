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

val Iconsax.Outline.VolumeSlash: ImageVector
    get() {
        if (_VolumeSlash != null) {
            return _VolumeSlash!!
        }
        _VolumeSlash = ImageVector.Builder(
            name = "Outline.VolumeSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 17.75f)
                horizontalLineTo(5f)
                curveTo(2.58f, 17.75f, 1.25f, 16.42f, 1.25f, 14f)
                verticalLineTo(10f)
                curveTo(1.25f, 7.58f, 2.58f, 6.25f, 5f, 6.25f)
                horizontalLineTo(6.43f)
                curveTo(6.66f, 6.25f, 6.89f, 6.18f, 7.09f, 6.06f)
                lineTo(10.01f, 4.23f)
                curveTo(11.47f, 3.32f, 12.89f, 3.15f, 14.01f, 3.77f)
                curveTo(15.13f, 4.39f, 15.74f, 5.68f, 15.74f, 7.41f)
                verticalLineTo(8.37f)
                curveTo(15.74f, 8.78f, 15.4f, 9.12f, 14.99f, 9.12f)
                curveTo(14.58f, 9.12f, 14.24f, 8.78f, 14.24f, 8.37f)
                verticalLineTo(7.41f)
                curveTo(14.24f, 6.27f, 13.89f, 5.42f, 13.28f, 5.09f)
                curveTo(12.67f, 4.75f, 11.77f, 4.9f, 10.8f, 5.51f)
                lineTo(7.88f, 7.33f)
                curveTo(7.45f, 7.61f, 6.94f, 7.75f, 6.43f, 7.75f)
                horizontalLineTo(5f)
                curveTo(3.42f, 7.75f, 2.75f, 8.42f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 15.58f, 3.42f, 16.25f, 5f, 16.25f)
                horizontalLineTo(7f)
                curveTo(7.41f, 16.25f, 7.75f, 16.59f, 7.75f, 17f)
                curveTo(7.75f, 17.41f, 7.41f, 17.75f, 7f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.55f, 20.59f)
                curveTo(11.76f, 20.59f, 10.89f, 20.31f, 10.02f, 19.76f)
                curveTo(9.67f, 19.54f, 9.56f, 19.08f, 9.78f, 18.73f)
                curveTo(10f, 18.38f, 10.46f, 18.27f, 10.81f, 18.49f)
                curveTo(11.78f, 19.09f, 12.68f, 19.25f, 13.29f, 18.91f)
                curveTo(13.9f, 18.57f, 14.25f, 17.72f, 14.25f, 16.59f)
                verticalLineTo(12.95f)
                curveTo(14.25f, 12.54f, 14.59f, 12.2f, 15f, 12.2f)
                curveTo(15.41f, 12.2f, 15.75f, 12.54f, 15.75f, 12.95f)
                verticalLineTo(16.59f)
                curveTo(15.75f, 18.31f, 15.13f, 19.61f, 14.02f, 20.23f)
                curveTo(13.57f, 20.47f, 13.07f, 20.59f, 12.55f, 20.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.75f)
                curveTo(17.84f, 16.75f, 17.69f, 16.7f, 17.55f, 16.6f)
                curveTo(17.22f, 16.35f, 17.15f, 15.88f, 17.4f, 15.55f)
                curveTo(18.66f, 13.87f, 18.93f, 11.64f, 18.12f, 9.71f)
                curveTo(17.96f, 9.33f, 18.14f, 8.89f, 18.52f, 8.73f)
                curveTo(18.9f, 8.57f, 19.34f, 8.75f, 19.5f, 9.13f)
                curveTo(20.52f, 11.55f, 20.17f, 14.36f, 18.6f, 16.46f)
                curveTo(18.45f, 16.65f, 18.23f, 16.75f, 18f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.83f, 19.25f)
                curveTo(19.67f, 19.25f, 19.52f, 19.2f, 19.38f, 19.1f)
                curveTo(19.05f, 18.85f, 18.98f, 18.38f, 19.23f, 18.05f)
                curveTo(21.37f, 15.2f, 21.84f, 11.38f, 20.46f, 8.09f)
                curveTo(20.3f, 7.71f, 20.48f, 7.27f, 20.86f, 7.11f)
                curveTo(21.25f, 6.95f, 21.68f, 7.13f, 21.84f, 7.51f)
                curveTo(23.43f, 11.29f, 22.89f, 15.67f, 20.43f, 18.95f)
                curveTo(20.29f, 19.15f, 20.06f, 19.25f, 19.83f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _VolumeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeSlash: ImageVector? = null
