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


val Iconsax.Filled.Edit2: ImageVector
    get() {
        if (_Edit2 != null) {
            return _Edit2!!
        }
        _Edit2 = ImageVector.Builder(
            name = "Filled.Edit2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22f, 2.25f, 21.66f, 2.25f, 21.25f)
                curveTo(2.25f, 20.84f, 2.59f, 20.5f, 3f, 20.5f)
                horizontalLineTo(21f)
                curveTo(21.41f, 20.5f, 21.75f, 20.84f, 21.75f, 21.25f)
                curveTo(21.75f, 21.66f, 21.41f, 22f, 21f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.021f, 3.482f)
                curveTo(17.081f, 1.542f, 15.181f, 1.492f, 13.191f, 3.482f)
                lineTo(11.981f, 4.692f)
                curveTo(11.881f, 4.792f, 11.841f, 4.952f, 11.881f, 5.092f)
                curveTo(12.641f, 7.742f, 14.761f, 9.862f, 17.411f, 10.622f)
                curveTo(17.451f, 10.632f, 17.491f, 10.642f, 17.531f, 10.642f)
                curveTo(17.641f, 10.642f, 17.741f, 10.602f, 17.821f, 10.522f)
                lineTo(19.021f, 9.312f)
                curveTo(20.011f, 8.332f, 20.491f, 7.382f, 20.491f, 6.422f)
                curveTo(20.501f, 5.432f, 20.021f, 4.472f, 19.021f, 3.482f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.61f, 11.531f)
                curveTo(15.32f, 11.391f, 15.04f, 11.251f, 14.77f, 11.091f)
                curveTo(14.55f, 10.961f, 14.34f, 10.821f, 14.13f, 10.671f)
                curveTo(13.96f, 10.561f, 13.76f, 10.401f, 13.57f, 10.241f)
                curveTo(13.55f, 10.231f, 13.48f, 10.171f, 13.4f, 10.091f)
                curveTo(13.07f, 9.811f, 12.7f, 9.451f, 12.37f, 9.051f)
                curveTo(12.34f, 9.031f, 12.29f, 8.961f, 12.22f, 8.871f)
                curveTo(12.12f, 8.751f, 11.95f, 8.551f, 11.8f, 8.321f)
                curveTo(11.68f, 8.171f, 11.54f, 7.951f, 11.41f, 7.731f)
                curveTo(11.25f, 7.461f, 11.11f, 7.191f, 10.97f, 6.911f)
                curveTo(10.949f, 6.865f, 10.929f, 6.82f, 10.909f, 6.775f)
                curveTo(10.761f, 6.442f, 10.326f, 6.345f, 10.069f, 6.602f)
                lineTo(4.34f, 12.331f)
                curveTo(4.21f, 12.461f, 4.09f, 12.711f, 4.06f, 12.881f)
                lineTo(3.52f, 16.711f)
                curveTo(3.42f, 17.391f, 3.61f, 18.031f, 4.03f, 18.461f)
                curveTo(4.39f, 18.811f, 4.89f, 19.001f, 5.43f, 19.001f)
                curveTo(5.55f, 19.001f, 5.67f, 18.991f, 5.79f, 18.971f)
                lineTo(9.63f, 18.431f)
                curveTo(9.81f, 18.401f, 10.06f, 18.281f, 10.18f, 18.151f)
                lineTo(15.902f, 12.429f)
                curveTo(16.161f, 12.17f, 16.063f, 11.724f, 15.726f, 11.58f)
                curveTo(15.688f, 11.564f, 15.649f, 11.548f, 15.61f, 11.531f)
                close()
            }
        }.build()

        return _Edit2!!
    }

@Suppress("ObjectPropertyName")
private var _Edit2: ImageVector? = null
