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

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.Cup: ImageVector
    get() {
        if (_Cup != null) {
            return _Cup!!
        }
        _Cup = ImageVector.Builder(
            name = "Filled.Cup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 18.251f)
                horizontalLineTo(9f)
                curveTo(7.9f, 18.251f, 7f, 19.151f, 7f, 20.251f)
                verticalLineTo(20.501f)
                horizontalLineTo(6f)
                curveTo(5.59f, 20.501f, 5.25f, 20.841f, 5.25f, 21.251f)
                curveTo(5.25f, 21.661f, 5.59f, 22.001f, 6f, 22.001f)
                horizontalLineTo(18f)
                curveTo(18.41f, 22.001f, 18.75f, 21.661f, 18.75f, 21.251f)
                curveTo(18.75f, 20.841f, 18.41f, 20.501f, 18f, 20.501f)
                horizontalLineTo(17f)
                verticalLineTo(20.251f)
                curveTo(17f, 19.151f, 16.1f, 18.251f, 15f, 18.251f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.961f)
                curveTo(12.5f, 15.991f, 12.25f, 16.001f, 12f, 16.001f)
                curveTo(11.75f, 16.001f, 11.5f, 15.991f, 11.25f, 15.961f)
                verticalLineTo(18.251f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.479f, 11.64f)
                curveTo(19.139f, 11.39f, 19.719f, 10.98f, 20.179f, 10.52f)
                curveTo(21.109f, 9.49f, 21.719f, 8.26f, 21.719f, 6.82f)
                curveTo(21.719f, 5.38f, 20.589f, 4.25f, 19.149f, 4.25f)
                horizontalLineTo(18.589f)
                curveTo(17.939f, 2.92f, 16.579f, 2f, 14.999f, 2f)
                horizontalLineTo(8.999f)
                curveTo(7.419f, 2f, 6.059f, 2.92f, 5.409f, 4.25f)
                horizontalLineTo(4.849f)
                curveTo(3.409f, 4.25f, 2.279f, 5.38f, 2.279f, 6.82f)
                curveTo(2.279f, 8.26f, 2.889f, 9.49f, 3.819f, 10.52f)
                curveTo(4.279f, 10.98f, 4.859f, 11.39f, 5.519f, 11.64f)
                curveTo(6.559f, 14.2f, 9.059f, 16f, 11.999f, 16f)
                curveTo(14.939f, 16f, 17.439f, 14.2f, 18.479f, 11.64f)
                close()
                moveTo(14.839f, 8.45f)
                lineTo(14.219f, 9.21f)
                curveTo(14.119f, 9.32f, 14.049f, 9.54f, 14.059f, 9.69f)
                lineTo(14.119f, 10.67f)
                curveTo(14.159f, 11.27f, 13.729f, 11.58f, 13.169f, 11.36f)
                lineTo(12.259f, 11f)
                curveTo(12.119f, 10.95f, 11.879f, 10.95f, 11.739f, 11f)
                lineTo(10.829f, 11.36f)
                curveTo(10.269f, 11.58f, 9.839f, 11.27f, 9.879f, 10.67f)
                lineTo(9.939f, 9.69f)
                curveTo(9.949f, 9.54f, 9.879f, 9.32f, 9.779f, 9.21f)
                lineTo(9.159f, 8.45f)
                curveTo(8.769f, 7.99f, 8.939f, 7.48f, 9.519f, 7.33f)
                lineTo(10.469f, 7.09f)
                curveTo(10.619f, 7.05f, 10.799f, 6.91f, 10.879f, 6.78f)
                lineTo(11.409f, 5.96f)
                curveTo(11.739f, 5.45f, 12.259f, 5.45f, 12.589f, 5.96f)
                lineTo(13.119f, 6.78f)
                curveTo(13.199f, 6.91f, 13.379f, 7.05f, 13.529f, 7.09f)
                lineTo(14.479f, 7.33f)
                curveTo(15.059f, 7.48f, 15.229f, 7.99f, 14.839f, 8.45f)
                close()
            }
        }.build()

        return _Cup!!
    }

@Suppress("ObjectPropertyName")
private var _Cup: ImageVector? = null
