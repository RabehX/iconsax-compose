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

val Iconsax.Outline.VolumeCross: ImageVector
    get() {
        if (_VolumeCross != null) {
            return _VolumeCross!!
        }
        _VolumeCross = ImageVector.Builder(
            name = "Outline.VolumeCross",
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
                curveTo(11.78f, 19.1f, 12.68f, 19.26f, 13.29f, 18.92f)
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
                moveTo(22f, 14.71f)
                curveTo(21.81f, 14.71f, 21.621f, 14.64f, 21.471f, 14.49f)
                lineTo(17.51f, 10.53f)
                curveTo(17.221f, 10.24f, 17.221f, 9.76f, 17.51f, 9.47f)
                curveTo(17.801f, 9.18f, 18.281f, 9.18f, 18.57f, 9.47f)
                lineTo(22.531f, 13.43f)
                curveTo(22.82f, 13.72f, 22.82f, 14.2f, 22.531f, 14.49f)
                curveTo(22.381f, 14.63f, 22.191f, 14.71f, 22f, 14.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 14.75f)
                curveTo(17.809f, 14.75f, 17.619f, 14.68f, 17.469f, 14.53f)
                curveTo(17.18f, 14.24f, 17.18f, 13.76f, 17.469f, 13.47f)
                lineTo(21.43f, 9.51f)
                curveTo(21.719f, 9.22f, 22.199f, 9.22f, 22.49f, 9.51f)
                curveTo(22.779f, 9.8f, 22.779f, 10.28f, 22.49f, 10.57f)
                lineTo(18.529f, 14.53f)
                curveTo(18.379f, 14.68f, 18.19f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return _VolumeCross!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeCross: ImageVector? = null
