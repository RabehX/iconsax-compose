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

val Iconsax.Outline.Cake: ImageVector
    get() {
        if (_Cake != null) {
            return _Cake!!
        }
        _Cake = ImageVector.Builder(
            name = "Outline.Cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.889f, 22.75f)
                curveTo(20.479f, 22.75f, 20.139f, 22.41f, 20.139f, 22f)
                verticalLineTo(13f)
                curveTo(20.139f, 11.76f, 18.979f, 10.75f, 17.559f, 10.75f)
                horizontalLineTo(6.439f)
                curveTo(5.019f, 10.75f, 3.859f, 11.76f, 3.859f, 13f)
                verticalLineTo(22f)
                curveTo(3.859f, 22.41f, 3.519f, 22.75f, 3.109f, 22.75f)
                curveTo(2.699f, 22.75f, 2.359f, 22.41f, 2.359f, 22f)
                verticalLineTo(13f)
                curveTo(2.359f, 10.93f, 4.189f, 9.25f, 6.439f, 9.25f)
                horizontalLineTo(17.549f)
                curveTo(19.799f, 9.25f, 21.629f, 10.93f, 21.629f, 13f)
                verticalLineTo(22f)
                curveTo(21.639f, 22.41f, 21.299f, 22.75f, 20.889f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.441f, 10.75f)
                curveTo(18.031f, 10.75f, 17.691f, 10.41f, 17.691f, 10f)
                verticalLineTo(7.17f)
                curveTo(17.691f, 6.39f, 16.941f, 5.75f, 16.031f, 5.75f)
                horizontalLineTo(7.981f)
                curveTo(7.061f, 5.75f, 6.321f, 6.39f, 6.321f, 7.17f)
                verticalLineTo(10f)
                curveTo(6.321f, 10.41f, 5.981f, 10.75f, 5.571f, 10.75f)
                curveTo(5.161f, 10.75f, 4.811f, 10.41f, 4.811f, 10f)
                verticalLineTo(7.17f)
                curveTo(4.811f, 5.56f, 6.231f, 4.25f, 7.971f, 4.25f)
                horizontalLineTo(16.021f)
                curveTo(17.76f, 4.25f, 19.181f, 5.56f, 19.181f, 7.17f)
                verticalLineTo(10f)
                curveTo(19.191f, 10.41f, 18.851f, 10.75f, 18.441f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.331f, 17.75f)
                curveTo(16.171f, 17.75f, 15.231f, 16.81f, 15.231f, 15.65f)
                verticalLineTo(15.34f)
                curveTo(15.231f, 15.01f, 14.961f, 14.74f, 14.631f, 14.74f)
                curveTo(14.301f, 14.74f, 14.031f, 15.01f, 14.031f, 15.34f)
                verticalLineTo(15.65f)
                curveTo(14.031f, 16.81f, 13.091f, 17.75f, 11.931f, 17.75f)
                curveTo(10.771f, 17.75f, 9.831f, 16.81f, 9.831f, 15.65f)
                verticalLineTo(15.34f)
                curveTo(9.831f, 15.01f, 9.561f, 14.74f, 9.231f, 14.74f)
                curveTo(8.901f, 14.74f, 8.631f, 15.01f, 8.631f, 15.34f)
                verticalLineTo(15.65f)
                curveTo(8.631f, 16.81f, 7.691f, 17.75f, 6.531f, 17.75f)
                curveTo(5.371f, 17.75f, 4.431f, 16.81f, 4.431f, 15.65f)
                verticalLineTo(15.32f)
                curveTo(4.431f, 15f, 4.171f, 14.73f, 3.841f, 14.72f)
                horizontalLineTo(3.471f)
                curveTo(3.061f, 14.71f, 2.721f, 14.37f, 2.731f, 13.96f)
                curveTo(2.741f, 13.55f, 3.071f, 13.22f, 3.481f, 13.22f)
                horizontalLineTo(3.491f)
                horizontalLineTo(3.861f)
                curveTo(5.001f, 13.24f, 5.931f, 14.18f, 5.931f, 15.32f)
                verticalLineTo(15.65f)
                curveTo(5.931f, 15.98f, 6.201f, 16.25f, 6.531f, 16.25f)
                curveTo(6.861f, 16.25f, 7.131f, 15.98f, 7.131f, 15.65f)
                verticalLineTo(15.34f)
                curveTo(7.131f, 14.18f, 8.071f, 13.24f, 9.231f, 13.24f)
                curveTo(10.391f, 13.24f, 11.331f, 14.18f, 11.331f, 15.34f)
                verticalLineTo(15.65f)
                curveTo(11.331f, 15.98f, 11.601f, 16.25f, 11.931f, 16.25f)
                curveTo(12.261f, 16.25f, 12.531f, 15.98f, 12.531f, 15.65f)
                verticalLineTo(15.34f)
                curveTo(12.531f, 14.18f, 13.471f, 13.24f, 14.631f, 13.24f)
                curveTo(15.791f, 13.24f, 16.731f, 14.18f, 16.731f, 15.34f)
                verticalLineTo(15.65f)
                curveTo(16.731f, 15.98f, 17.001f, 16.25f, 17.331f, 16.25f)
                curveTo(17.661f, 16.25f, 17.931f, 15.98f, 17.931f, 15.65f)
                verticalLineTo(15.34f)
                curveTo(17.931f, 14.18f, 18.871f, 13.24f, 20.031f, 13.24f)
                horizontalLineTo(20.481f)
                curveTo(20.891f, 13.24f, 21.231f, 13.58f, 21.231f, 13.99f)
                curveTo(21.231f, 14.4f, 20.891f, 14.74f, 20.481f, 14.74f)
                horizontalLineTo(20.031f)
                curveTo(19.701f, 14.74f, 19.431f, 15.01f, 19.431f, 15.34f)
                verticalLineTo(15.65f)
                curveTo(19.431f, 16.81f, 18.491f, 17.75f, 17.331f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(3f)
                curveTo(7.25f, 2.59f, 7.59f, 2.25f, 8f, 2.25f)
                curveTo(8.41f, 2.25f, 8.75f, 2.59f, 8.75f, 3f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(3f)
                curveTo(15.25f, 2.59f, 15.59f, 2.25f, 16f, 2.25f)
                curveTo(16.41f, 2.25f, 16.75f, 2.59f, 16.75f, 3f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 5.75f)
                curveTo(11.59f, 5.75f, 11.25f, 5.41f, 11.25f, 5f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(5f)
                curveTo(12.75f, 5.41f, 12.41f, 5.75f, 12f, 5.75f)
                close()
            }
        }.build()

        return _Cake!!
    }

@Suppress("ObjectPropertyName")
private var _Cake: ImageVector? = null
