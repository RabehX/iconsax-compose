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

val Iconsax.Outline.Image: ImageVector
    get() {
        if (_Image != null) {
            return _Image!!
        }
        _Image = ImageVector.Builder(
            name = "Outline.Image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.361f, 22.75f)
                horizontalLineTo(5.591f)
                curveTo(4.071f, 22.75f, 2.681f, 21.98f, 1.881f, 20.68f)
                curveTo(1.081f, 19.38f, 1.011f, 17.8f, 1.691f, 16.43f)
                lineTo(3.411f, 12.98f)
                curveTo(3.971f, 11.86f, 4.871f, 11.16f, 5.881f, 11.05f)
                curveTo(6.891f, 10.94f, 7.921f, 11.44f, 8.701f, 12.41f)
                lineTo(8.921f, 12.69f)
                curveTo(9.361f, 13.23f, 9.871f, 13.52f, 10.371f, 13.47f)
                curveTo(10.871f, 13.43f, 11.331f, 13.07f, 11.671f, 12.46f)
                lineTo(13.561f, 9.05f)
                curveTo(14.341f, 7.64f, 15.381f, 6.91f, 16.511f, 6.96f)
                curveTo(17.631f, 7.02f, 18.591f, 7.86f, 19.231f, 9.34f)
                lineTo(22.361f, 16.65f)
                curveTo(22.941f, 18f, 22.801f, 19.54f, 21.991f, 20.77f)
                curveTo(21.191f, 22.02f, 19.831f, 22.75f, 18.361f, 22.75f)
                close()
                moveTo(6.161f, 12.55f)
                curveTo(6.121f, 12.55f, 6.081f, 12.55f, 6.041f, 12.56f)
                curveTo(5.541f, 12.61f, 5.081f, 13.01f, 4.751f, 13.66f)
                lineTo(3.031f, 17.11f)
                curveTo(2.581f, 18f, 2.631f, 19.05f, 3.151f, 19.9f)
                curveTo(3.671f, 20.75f, 4.591f, 21.26f, 5.591f, 21.26f)
                horizontalLineTo(18.351f)
                curveTo(19.331f, 21.26f, 20.201f, 20.79f, 20.741f, 19.97f)
                curveTo(21.281f, 19.15f, 21.371f, 18.17f, 20.981f, 17.27f)
                lineTo(17.851f, 9.96f)
                curveTo(17.471f, 9.06f, 16.941f, 8.51f, 16.431f, 8.49f)
                curveTo(15.961f, 8.46f, 15.351f, 8.96f, 14.871f, 9.81f)
                lineTo(12.981f, 13.22f)
                curveTo(12.401f, 14.26f, 11.491f, 14.91f, 10.501f, 15f)
                curveTo(9.511f, 15.08f, 8.501f, 14.6f, 7.751f, 13.66f)
                lineTo(7.531f, 13.38f)
                curveTo(7.111f, 12.83f, 6.631f, 12.55f, 6.161f, 12.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.971f, 8.75f)
                curveTo(4.911f, 8.75f, 3.221f, 7.07f, 3.221f, 5f)
                curveTo(3.221f, 2.93f, 4.901f, 1.25f, 6.971f, 1.25f)
                curveTo(9.041f, 1.25f, 10.721f, 2.93f, 10.721f, 5f)
                curveTo(10.721f, 7.07f, 9.041f, 8.75f, 6.971f, 8.75f)
                close()
                moveTo(6.971f, 2.75f)
                curveTo(5.731f, 2.75f, 4.721f, 3.76f, 4.721f, 5f)
                curveTo(4.721f, 6.24f, 5.731f, 7.25f, 6.971f, 7.25f)
                curveTo(8.211f, 7.25f, 9.221f, 6.24f, 9.221f, 5f)
                curveTo(9.221f, 3.76f, 8.211f, 2.75f, 6.971f, 2.75f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null
