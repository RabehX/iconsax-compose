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

val Iconsax.Outline.VolumeUp: ImageVector
    get() {
        if (_VolumeUp != null) {
            return _VolumeUp!!
        }
        _VolumeUp = ImageVector.Builder(
            name = "Outline.VolumeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.76f, 20.75f)
                curveTo(11.95f, 20.75f, 11.08f, 20.47f, 10.18f, 19.91f)
                lineTo(7.2f, 18.05f)
                curveTo(6.99f, 17.92f, 6.76f, 17.85f, 6.52f, 17.85f)
                horizontalLineTo(5.06f)
                curveTo(2.6f, 17.85f, 1.25f, 16.5f, 1.25f, 14.04f)
                verticalLineTo(9.96f)
                curveTo(1.25f, 7.5f, 2.6f, 6.15f, 5.06f, 6.15f)
                horizontalLineTo(6.52f)
                curveTo(6.76f, 6.15f, 7f, 6.08f, 7.2f, 5.95f)
                lineTo(10.18f, 4.09f)
                curveTo(11.67f, 3.16f, 13.11f, 2.99f, 14.25f, 3.63f)
                curveTo(15.39f, 4.26f, 16.01f, 5.57f, 16.01f, 7.33f)
                verticalLineTo(16.69f)
                curveTo(16.01f, 18.44f, 15.38f, 19.76f, 14.25f, 20.39f)
                curveTo(13.8f, 20.63f, 13.3f, 20.75f, 12.76f, 20.75f)
                close()
                moveTo(5.06f, 7.65f)
                curveTo(3.44f, 7.65f, 2.75f, 8.34f, 2.75f, 9.96f)
                verticalLineTo(14.04f)
                curveTo(2.75f, 15.66f, 3.44f, 16.35f, 5.06f, 16.35f)
                horizontalLineTo(6.52f)
                curveTo(7.04f, 16.35f, 7.55f, 16.5f, 8f, 16.77f)
                lineTo(10.98f, 18.63f)
                curveTo(11.97f, 19.25f, 12.9f, 19.4f, 13.53f, 19.06f)
                curveTo(14.16f, 18.71f, 14.52f, 17.84f, 14.52f, 16.68f)
                verticalLineTo(7.32f)
                curveTo(14.52f, 6.15f, 14.16f, 5.28f, 13.53f, 4.94f)
                curveTo(12.9f, 4.59f, 11.97f, 4.75f, 10.98f, 5.37f)
                lineTo(8f, 7.22f)
                curveTo(7.55f, 7.5f, 7.04f, 7.65f, 6.52f, 7.65f)
                horizontalLineTo(5.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(18f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12f)
                curveTo(17.25f, 11.59f, 17.59f, 11.25f, 18f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 14.75f)
                curveTo(19.59f, 14.75f, 19.25f, 14.41f, 19.25f, 14f)
                verticalLineTo(10f)
                curveTo(19.25f, 9.59f, 19.59f, 9.25f, 20f, 9.25f)
                curveTo(20.41f, 9.25f, 20.75f, 9.59f, 20.75f, 10f)
                verticalLineTo(14f)
                curveTo(20.75f, 14.41f, 20.41f, 14.75f, 20f, 14.75f)
                close()
            }
        }.build()

        return _VolumeUp!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeUp: ImageVector? = null
