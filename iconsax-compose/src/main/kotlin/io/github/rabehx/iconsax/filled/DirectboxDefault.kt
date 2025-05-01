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


val Iconsax.Filled.DirectboxDefault: ImageVector
    get() {
        if (_DirectboxDefault != null) {
            return _DirectboxDefault!!
        }
        _DirectboxDefault = ImageVector.Builder(
            name = "Filled.DirectboxDefault",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.69f, 11.531f)
                curveTo(18.12f, 11.381f, 17.45f, 11.301f, 16.65f, 11.301f)
                curveTo(15.54f, 11.301f, 15.13f, 11.571f, 14.56f, 12.001f)
                curveTo(14.53f, 12.021f, 14.5f, 12.051f, 14.47f, 12.081f)
                lineTo(13.52f, 13.091f)
                curveTo(12.72f, 13.931f, 11.28f, 13.941f, 10.48f, 13.081f)
                lineTo(9.53f, 12.081f)
                curveTo(9.5f, 12.051f, 9.47f, 12.021f, 9.44f, 12.001f)
                curveTo(8.87f, 11.571f, 8.46f, 11.301f, 7.35f, 11.301f)
                curveTo(6.55f, 11.301f, 5.88f, 11.381f, 5.31f, 11.531f)
                curveTo(2.93f, 12.171f, 2.93f, 14.061f, 2.93f, 15.721f)
                verticalLineTo(16.651f)
                curveTo(2.93f, 19.161f, 2.93f, 22.001f, 8.28f, 22.001f)
                horizontalLineTo(15.72f)
                curveTo(19.27f, 22.001f, 21.07f, 20.201f, 21.07f, 16.651f)
                verticalLineTo(15.721f)
                curveTo(21.07f, 14.061f, 21.07f, 12.171f, 18.69f, 11.531f)
                close()
                moveTo(14.33f, 18.401f)
                horizontalLineTo(9.67f)
                curveTo(9.29f, 18.401f, 8.98f, 18.091f, 8.98f, 17.701f)
                curveTo(8.98f, 17.311f, 9.29f, 17.001f, 9.67f, 17.001f)
                horizontalLineTo(14.33f)
                curveTo(14.71f, 17.001f, 15.02f, 17.311f, 15.02f, 17.701f)
                curveTo(15.02f, 18.091f, 14.71f, 18.401f, 14.33f, 18.401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.209f, 6.42f)
                verticalLineTo(10.12f)
                curveTo(19.169f, 10.1f, 19.119f, 10.09f, 19.079f, 10.08f)
                curveTo(18.379f, 9.89f, 17.589f, 9.8f, 16.649f, 9.8f)
                curveTo(15.109f, 9.8f, 14.389f, 10.25f, 13.649f, 10.81f)
                curveTo(13.549f, 10.88f, 13.459f, 10.97f, 13.379f, 11.05f)
                lineTo(12.419f, 12.06f)
                curveTo(12.329f, 12.16f, 12.169f, 12.22f, 11.999f, 12.22f)
                curveTo(11.829f, 12.22f, 11.669f, 12.16f, 11.569f, 12.05f)
                lineTo(10.629f, 11.06f)
                curveTo(10.539f, 10.96f, 10.439f, 10.87f, 10.339f, 10.8f)
                curveTo(9.619f, 10.25f, 8.889f, 9.8f, 7.349f, 9.8f)
                curveTo(6.409f, 9.8f, 5.619f, 9.89f, 4.919f, 10.08f)
                curveTo(4.879f, 10.09f, 4.829f, 10.1f, 4.789f, 10.12f)
                verticalLineTo(6.42f)
                curveTo(4.789f, 4.35f, 4.789f, 2f, 9.209f, 2f)
                horizontalLineTo(14.789f)
                curveTo(19.209f, 2f, 19.209f, 4.35f, 19.209f, 6.42f)
                close()
            }
        }.build()

        return _DirectboxDefault!!
    }

@Suppress("ObjectPropertyName")
private var _DirectboxDefault: ImageVector? = null
