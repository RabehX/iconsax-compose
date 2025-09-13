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

val Iconsax.Filled.Award: ImageVector
    get() {
        if (_Award != null) {
            return _Award!!
        }
        _Award = ImageVector.Builder(
            name = "Filled.Award",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.811f, 5.49f)
                verticalLineTo(6.23f)
                lineTo(14.271f, 4.18f)
                curveTo(12.931f, 3.41f, 11.061f, 3.41f, 9.731f, 4.18f)
                lineTo(6.191f, 6.24f)
                verticalLineTo(5.49f)
                curveTo(6.191f, 3.24f, 7.421f, 2f, 9.671f, 2f)
                horizontalLineTo(14.331f)
                curveTo(16.581f, 2f, 17.811f, 3.24f, 17.811f, 5.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.84f, 7.968f)
                lineTo(17.7f, 7.898f)
                lineTo(16.34f, 7.118f)
                lineTo(13.52f, 5.488f)
                curveTo(12.66f, 4.988f, 11.34f, 4.988f, 10.48f, 5.488f)
                lineTo(7.66f, 7.108f)
                lineTo(6.3f, 7.908f)
                lineTo(6.12f, 7.998f)
                curveTo(4.37f, 9.178f, 4.25f, 9.398f, 4.25f, 11.288f)
                verticalLineTo(15.808f)
                curveTo(4.25f, 17.698f, 4.37f, 17.918f, 6.16f, 19.128f)
                lineTo(10.48f, 21.618f)
                curveTo(10.91f, 21.878f, 11.45f, 21.988f, 12f, 21.988f)
                curveTo(12.54f, 21.988f, 13.09f, 21.868f, 13.52f, 21.618f)
                lineTo(17.88f, 19.098f)
                curveTo(19.64f, 17.918f, 19.75f, 17.708f, 19.75f, 15.808f)
                verticalLineTo(11.288f)
                curveTo(19.75f, 9.398f, 19.63f, 9.178f, 17.84f, 7.968f)
                close()
                moveTo(14.79f, 13.498f)
                lineTo(14.18f, 14.248f)
                curveTo(14.08f, 14.358f, 14.01f, 14.568f, 14.02f, 14.718f)
                lineTo(14.08f, 15.678f)
                curveTo(14.12f, 16.268f, 13.7f, 16.568f, 13.15f, 16.358f)
                lineTo(12.26f, 15.998f)
                curveTo(12.12f, 15.948f, 11.89f, 15.948f, 11.75f, 15.998f)
                lineTo(10.86f, 16.348f)
                curveTo(10.31f, 16.568f, 9.89f, 16.258f, 9.93f, 15.668f)
                lineTo(9.99f, 14.708f)
                curveTo(10f, 14.558f, 9.93f, 14.348f, 9.83f, 14.238f)
                lineTo(9.21f, 13.498f)
                curveTo(8.83f, 13.048f, 9f, 12.548f, 9.57f, 12.398f)
                lineTo(10.5f, 12.158f)
                curveTo(10.65f, 12.118f, 10.82f, 11.978f, 10.9f, 11.858f)
                lineTo(11.42f, 11.058f)
                curveTo(11.74f, 10.558f, 12.25f, 10.558f, 12.58f, 11.058f)
                lineTo(13.1f, 11.858f)
                curveTo(13.18f, 11.988f, 13.36f, 12.118f, 13.5f, 12.158f)
                lineTo(14.43f, 12.398f)
                curveTo(15f, 12.548f, 15.17f, 13.048f, 14.79f, 13.498f)
                close()
            }
        }.build()

        return _Award!!
    }

@Suppress("ObjectPropertyName")
private var _Award: ImageVector? = null
