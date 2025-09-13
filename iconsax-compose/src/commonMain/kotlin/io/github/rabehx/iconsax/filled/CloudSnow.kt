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


val Iconsax.Filled.CloudSnow: ImageVector
    get() {
        if (_CloudSnow != null) {
            return _CloudSnow!!
        }
        _CloudSnow = ImageVector.Builder(
            name = "Filled.CloudSnow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.17f, 17.571f)
                curveTo(19.64f, 18.061f, 19.03f, 18.431f, 18.37f, 18.681f)
                curveTo(17.71f, 18.931f, 17f, 18.451f, 17f, 17.741f)
                verticalLineTo(16.421f)
                curveTo(17f, 14.471f, 15.42f, 12.891f, 13.47f, 12.891f)
                horizontalLineTo(10.53f)
                curveTo(8.58f, 12.891f, 7f, 14.471f, 7f, 16.421f)
                verticalLineTo(18.001f)
                curveTo(7f, 18.551f, 6.55f, 19.001f, 6f, 19.001f)
                horizontalLineTo(5.55f)
                curveTo(3.1f, 18.631f, 2f, 16.641f, 2f, 14.861f)
                curveTo(2f, 13.181f, 2.98f, 11.321f, 5.11f, 10.801f)
                curveTo(4.52f, 8.471f, 5.02f, 6.281f, 6.54f, 4.691f)
                curveTo(8.27f, 2.881f, 11.03f, 2.161f, 13.41f, 2.901f)
                curveTo(15.6f, 3.571f, 17.14f, 5.371f, 17.69f, 7.871f)
                curveTo(19.6f, 8.301f, 21.13f, 9.741f, 21.74f, 11.741f)
                curveTo(22.4f, 13.911f, 21.8f, 16.141f, 20.17f, 17.571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.47f, 14.391f)
                horizontalLineTo(10.53f)
                curveTo(9.26f, 14.391f, 8.5f, 15.151f, 8.5f, 16.421f)
                verticalLineTo(19.361f)
                curveTo(8.5f, 20.631f, 9.26f, 21.391f, 10.53f, 21.391f)
                horizontalLineTo(13.47f)
                curveTo(14.74f, 21.391f, 15.5f, 20.631f, 15.5f, 19.361f)
                verticalLineTo(16.421f)
                curveTo(15.5f, 15.151f, 14.74f, 14.391f, 13.47f, 14.391f)
                close()
                moveTo(10.5f, 17.631f)
                curveTo(10.08f, 17.631f, 9.75f, 17.291f, 9.75f, 16.881f)
                curveTo(9.75f, 16.471f, 10.08f, 16.131f, 10.5f, 16.131f)
                curveTo(10.92f, 16.131f, 11.25f, 16.471f, 11.25f, 16.881f)
                curveTo(11.25f, 17.291f, 10.91f, 17.631f, 10.5f, 17.631f)
                close()
                moveTo(12f, 19.881f)
                curveTo(11.59f, 19.881f, 11.25f, 19.541f, 11.25f, 19.131f)
                curveTo(11.25f, 18.721f, 11.59f, 18.381f, 12f, 18.381f)
                curveTo(12.41f, 18.381f, 12.75f, 18.721f, 12.75f, 19.131f)
                curveTo(12.75f, 19.541f, 12.42f, 19.881f, 12f, 19.881f)
                close()
                moveTo(13.51f, 17.631f)
                curveTo(13.09f, 17.631f, 12.76f, 17.291f, 12.76f, 16.881f)
                curveTo(12.76f, 16.471f, 13.09f, 16.131f, 13.51f, 16.131f)
                curveTo(13.93f, 16.131f, 14.26f, 16.471f, 14.26f, 16.881f)
                curveTo(14.26f, 17.291f, 13.92f, 17.631f, 13.51f, 17.631f)
                close()
            }
        }.build()

        return _CloudSnow!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSnow: ImageVector? = null
