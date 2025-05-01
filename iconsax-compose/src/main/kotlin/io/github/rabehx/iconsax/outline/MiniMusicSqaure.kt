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

val Iconsax.Outline.MiniMusicSqaure: ImageVector
    get() {
        if (_MiniMusicSqaure != null) {
            return _MiniMusicSqaure!!
        }
        _MiniMusicSqaure = ImageVector.Builder(
            name = "Outline.MiniMusicSqaure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(10f)
                curveTo(22.75f, 10.41f, 22.41f, 10.75f, 22f, 10.75f)
                curveTo(21.59f, 10.75f, 21.25f, 10.41f, 21.25f, 10f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(11f)
                curveTo(11.41f, 21.25f, 11.75f, 21.59f, 11.75f, 22f)
                curveTo(11.75f, 22.41f, 11.41f, 22.75f, 11f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.27f, 22.75f)
                curveTo(14.06f, 22.75f, 13.08f, 21.77f, 13.08f, 20.56f)
                curveTo(13.08f, 19.35f, 14.06f, 18.37f, 15.27f, 18.37f)
                curveTo(16.48f, 18.37f, 17.46f, 19.35f, 17.46f, 20.56f)
                curveTo(17.46f, 21.77f, 16.48f, 22.75f, 15.27f, 22.75f)
                close()
                moveTo(15.27f, 19.86f)
                curveTo(14.89f, 19.86f, 14.58f, 20.17f, 14.58f, 20.55f)
                curveTo(14.58f, 20.93f, 14.89f, 21.24f, 15.27f, 21.24f)
                curveTo(15.65f, 21.24f, 15.96f, 20.93f, 15.96f, 20.55f)
                curveTo(15.96f, 20.17f, 15.65f, 19.86f, 15.27f, 19.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.711f, 21.31f)
                curveTo(16.301f, 21.31f, 15.961f, 20.97f, 15.961f, 20.56f)
                verticalLineTo(14.74f)
                curveTo(15.961f, 13.83f, 16.521f, 13.09f, 17.401f, 12.86f)
                lineTo(20.291f, 12.07f)
                curveTo(21.191f, 11.82f, 21.751f, 12.06f, 22.071f, 12.3f)
                curveTo(22.381f, 12.54f, 22.751f, 13.02f, 22.751f, 13.95f)
                verticalLineTo(19.59f)
                curveTo(22.751f, 20f, 22.411f, 20.34f, 22.001f, 20.34f)
                curveTo(21.591f, 20.34f, 21.251f, 20f, 21.251f, 19.59f)
                verticalLineTo(13.95f)
                curveTo(21.251f, 13.63f, 21.181f, 13.51f, 21.151f, 13.49f)
                curveTo(21.121f, 13.47f, 20.981f, 13.43f, 20.671f, 13.51f)
                lineTo(17.781f, 14.3f)
                curveTo(17.481f, 14.38f, 17.451f, 14.59f, 17.451f, 14.74f)
                verticalLineTo(20.56f)
                curveTo(17.461f, 20.97f, 17.121f, 21.31f, 16.711f, 21.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.561f, 21.79f)
                curveTo(19.351f, 21.79f, 18.371f, 20.81f, 18.371f, 19.6f)
                curveTo(18.371f, 18.39f, 19.351f, 17.41f, 20.561f, 17.41f)
                curveTo(21.771f, 17.41f, 22.751f, 18.39f, 22.751f, 19.6f)
                curveTo(22.751f, 20.81f, 21.771f, 21.79f, 20.561f, 21.79f)
                close()
                moveTo(20.561f, 18.9f)
                curveTo(20.181f, 18.9f, 19.871f, 19.21f, 19.871f, 19.59f)
                curveTo(19.871f, 19.97f, 20.181f, 20.28f, 20.561f, 20.28f)
                curveTo(20.941f, 20.28f, 21.251f, 19.97f, 21.251f, 19.59f)
                curveTo(21.251f, 19.21f, 20.941f, 18.9f, 20.561f, 18.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.71f, 17.18f)
                curveTo(16.38f, 17.18f, 16.08f, 16.96f, 15.99f, 16.63f)
                curveTo(15.88f, 16.23f, 16.12f, 15.82f, 16.52f, 15.71f)
                lineTo(21.81f, 14.27f)
                curveTo(22.21f, 14.16f, 22.62f, 14.4f, 22.73f, 14.8f)
                curveTo(22.84f, 15.2f, 22.6f, 15.61f, 22.2f, 15.72f)
                lineTo(16.91f, 17.16f)
                curveTo(16.84f, 17.17f, 16.77f, 17.18f, 16.71f, 17.18f)
                close()
            }
        }.build()

        return _MiniMusicSqaure!!
    }

@Suppress("ObjectPropertyName")
private var _MiniMusicSqaure: ImageVector? = null
