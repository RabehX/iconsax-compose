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

val Iconsax.Outline.Verify: ImageVector
    get() {
        if (_Verify != null) {
            return _Verify!!
        }
        _Verify = ImageVector.Builder(
            name = "Outline.Verify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.79f, 15.17f)
                curveTo(10.59f, 15.17f, 10.401f, 15.09f, 10.26f, 14.95f)
                lineTo(7.841f, 12.53f)
                curveTo(7.551f, 12.24f, 7.551f, 11.76f, 7.841f, 11.47f)
                curveTo(8.131f, 11.18f, 8.611f, 11.18f, 8.901f, 11.47f)
                lineTo(10.79f, 13.36f)
                lineTo(15.09f, 9.06f)
                curveTo(15.38f, 8.77f, 15.861f, 8.77f, 16.15f, 9.06f)
                curveTo(16.441f, 9.35f, 16.441f, 9.83f, 16.15f, 10.12f)
                lineTo(11.321f, 14.95f)
                curveTo(11.181f, 15.09f, 10.991f, 15.17f, 10.79f, 15.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 22.75f)
                curveTo(11.371f, 22.75f, 10.741f, 22.54f, 10.251f, 22.12f)
                lineTo(8.671f, 20.76f)
                curveTo(8.511f, 20.62f, 8.111f, 20.48f, 7.901f, 20.48f)
                horizontalLineTo(6.181f)
                curveTo(4.701f, 20.48f, 3.501f, 19.28f, 3.501f, 17.8f)
                verticalLineTo(16.09f)
                curveTo(3.501f, 15.88f, 3.361f, 15.49f, 3.221f, 15.33f)
                lineTo(1.871f, 13.74f)
                curveTo(1.051f, 12.77f, 1.051f, 11.24f, 1.871f, 10.27f)
                lineTo(3.221f, 8.68f)
                curveTo(3.361f, 8.52f, 3.501f, 8.13f, 3.501f, 7.92f)
                verticalLineTo(6.2f)
                curveTo(3.501f, 4.72f, 4.701f, 3.52f, 6.181f, 3.52f)
                horizontalLineTo(7.911f)
                curveTo(8.121f, 3.52f, 8.521f, 3.37f, 8.681f, 3.24f)
                lineTo(10.261f, 1.88f)
                curveTo(11.241f, 1.04f, 12.771f, 1.04f, 13.751f, 1.88f)
                lineTo(15.331f, 3.24f)
                curveTo(15.491f, 3.38f, 15.891f, 3.52f, 16.101f, 3.52f)
                horizontalLineTo(17.801f)
                curveTo(19.281f, 3.52f, 20.481f, 4.72f, 20.481f, 6.2f)
                verticalLineTo(7.9f)
                curveTo(20.481f, 8.11f, 20.631f, 8.51f, 20.771f, 8.67f)
                lineTo(22.131f, 10.25f)
                curveTo(22.971f, 11.23f, 22.971f, 12.76f, 22.131f, 13.74f)
                lineTo(20.771f, 15.32f)
                curveTo(20.631f, 15.48f, 20.481f, 15.88f, 20.481f, 16.09f)
                verticalLineTo(17.79f)
                curveTo(20.481f, 19.27f, 19.281f, 20.47f, 17.801f, 20.47f)
                horizontalLineTo(16.101f)
                curveTo(15.891f, 20.47f, 15.491f, 20.62f, 15.331f, 20.75f)
                lineTo(13.751f, 22.11f)
                curveTo(13.261f, 22.54f, 12.631f, 22.75f, 12.001f, 22.75f)
                close()
                moveTo(6.181f, 5.02f)
                curveTo(5.531f, 5.02f, 5.001f, 5.55f, 5.001f, 6.2f)
                verticalLineTo(7.91f)
                curveTo(5.001f, 8.48f, 4.731f, 9.21f, 4.361f, 9.64f)
                lineTo(3.011f, 11.23f)
                curveTo(2.661f, 11.64f, 2.661f, 12.35f, 3.011f, 12.76f)
                lineTo(4.361f, 14.35f)
                curveTo(4.731f, 14.79f, 5.001f, 15.51f, 5.001f, 16.08f)
                verticalLineTo(17.79f)
                curveTo(5.001f, 18.44f, 5.531f, 18.97f, 6.181f, 18.97f)
                horizontalLineTo(7.911f)
                curveTo(8.491f, 18.97f, 9.221f, 19.24f, 9.661f, 19.62f)
                lineTo(11.241f, 20.98f)
                curveTo(11.651f, 21.33f, 12.371f, 21.33f, 12.781f, 20.98f)
                lineTo(14.361f, 19.62f)
                curveTo(14.801f, 19.25f, 15.531f, 18.97f, 16.111f, 18.97f)
                horizontalLineTo(17.811f)
                curveTo(18.461f, 18.97f, 18.991f, 18.44f, 18.991f, 17.79f)
                verticalLineTo(16.09f)
                curveTo(18.991f, 15.51f, 19.261f, 14.78f, 19.641f, 14.34f)
                lineTo(21.001f, 12.76f)
                curveTo(21.351f, 12.35f, 21.351f, 11.63f, 21.001f, 11.22f)
                lineTo(19.641f, 9.64f)
                curveTo(19.261f, 9.2f, 18.991f, 8.47f, 18.991f, 7.89f)
                verticalLineTo(6.2f)
                curveTo(18.991f, 5.55f, 18.461f, 5.02f, 17.811f, 5.02f)
                horizontalLineTo(16.111f)
                curveTo(15.531f, 5.02f, 14.801f, 4.75f, 14.361f, 4.37f)
                lineTo(12.781f, 3.01f)
                curveTo(12.371f, 2.66f, 11.651f, 2.66f, 11.241f, 3.01f)
                lineTo(9.661f, 4.38f)
                curveTo(9.221f, 4.75f, 8.481f, 5.02f, 7.911f, 5.02f)
                horizontalLineTo(6.181f)
                close()
            }
        }.build()

        return _Verify!!
    }

@Suppress("ObjectPropertyName")
private var _Verify: ImageVector? = null
