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


val Iconsax.Filled.MusicDashboard: ImageVector
    get() {
        if (_MusicDashboard != null) {
            return _MusicDashboard!!
        }
        _MusicDashboard = ImageVector.Builder(
            name = "Filled.MusicDashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 3.252f)
                verticalLineTo(20.752f)
                curveTo(7f, 21.392f, 6.39f, 21.902f, 5.77f, 21.732f)
                curveTo(3.37f, 21.052f, 2f, 19.092f, 2f, 16.192f)
                verticalLineTo(7.812f)
                curveTo(2f, 4.912f, 3.37f, 2.952f, 5.77f, 2.272f)
                curveTo(6.39f, 2.102f, 7f, 2.602f, 7f, 3.252f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.469f, 14.371f)
                curveTo(12.089f, 14.371f, 11.789f, 14.681f, 11.789f, 15.051f)
                curveTo(11.789f, 15.421f, 12.099f, 15.731f, 12.469f, 15.731f)
                curveTo(12.849f, 15.731f, 13.159f, 15.421f, 13.159f, 15.051f)
                curveTo(13.159f, 14.681f, 12.849f, 14.371f, 12.469f, 14.371f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.518f, 13.449f)
                curveTo(17.138f, 13.449f, 16.828f, 13.759f, 16.828f, 14.139f)
                curveTo(16.828f, 14.519f, 17.138f, 14.819f, 17.518f, 14.819f)
                curveTo(17.898f, 14.819f, 18.208f, 14.509f, 18.208f, 14.139f)
                curveTo(18.208f, 13.769f, 17.898f, 13.449f, 17.518f, 13.449f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(9.5f)
                curveTo(8.95f, 2f, 8.5f, 2.45f, 8.5f, 3f)
                verticalLineTo(21f)
                curveTo(8.5f, 21.55f, 8.95f, 22f, 9.5f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.4f, 22f, 22f, 19.4f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.6f, 19.4f, 2f, 16.19f, 2f)
                close()
                moveTo(19.6f, 9.74f)
                verticalLineTo(14.14f)
                curveTo(19.6f, 14.15f, 19.59f, 14.16f, 19.59f, 14.17f)
                curveTo(19.57f, 15.3f, 18.65f, 16.21f, 17.52f, 16.21f)
                curveTo(16.38f, 16.21f, 15.45f, 15.28f, 15.45f, 14.14f)
                curveTo(15.45f, 13f, 16.38f, 12.07f, 17.52f, 12.07f)
                curveTo(17.76f, 12.07f, 17.99f, 12.12f, 18.21f, 12.2f)
                verticalLineTo(10.65f)
                lineTo(14.54f, 11.65f)
                verticalLineTo(15.07f)
                curveTo(14.54f, 15.08f, 14.53f, 15.09f, 14.53f, 15.1f)
                curveTo(14.51f, 16.23f, 13.59f, 17.14f, 12.46f, 17.14f)
                curveTo(11.32f, 17.14f, 10.39f, 16.21f, 10.39f, 15.07f)
                curveTo(10.39f, 13.93f, 11.32f, 13f, 12.46f, 13f)
                curveTo(12.7f, 13f, 12.93f, 13.05f, 13.15f, 13.13f)
                verticalLineTo(11.13f)
                verticalLineTo(9.5f)
                curveTo(13.15f, 8.64f, 13.68f, 7.94f, 14.51f, 7.73f)
                lineTo(17.26f, 6.97f)
                curveTo(18.12f, 6.74f, 18.65f, 6.97f, 18.95f, 7.2f)
                curveTo(19.38f, 7.53f, 19.59f, 8.05f, 19.59f, 8.75f)
                verticalLineTo(9.74f)
                horizontalLineTo(19.6f)
                close()
            }
        }.build()

        return _MusicDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _MusicDashboard: ImageVector? = null
