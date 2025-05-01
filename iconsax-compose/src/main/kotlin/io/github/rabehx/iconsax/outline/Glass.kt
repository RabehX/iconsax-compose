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

val Iconsax.Outline.Glass: ImageVector
    get() {
        if (_Glass != null) {
            return _Glass!!
        }
        _Glass = ImageVector.Builder(
            name = "Outline.Glass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.839f, 22.75f)
                horizontalLineTo(8.159f)
                curveTo(5.479f, 22.75f, 4.259f, 21.75f, 3.719f, 20.92f)
                curveTo(2.929f, 19.7f, 2.959f, 18.03f, 3.809f, 16.09f)
                lineTo(7.639f, 7.39f)
                curveTo(7.109f, 7.25f, 6.619f, 6.97f, 6.229f, 6.58f)
                curveTo(5.659f, 6f, 5.319f, 5.2f, 5.319f, 4.37f)
                curveTo(5.319f, 2.65f, 6.719f, 1.25f, 8.439f, 1.25f)
                horizontalLineTo(15.549f)
                curveTo(16.379f, 1.25f, 17.169f, 1.58f, 17.759f, 2.17f)
                curveTo(18.539f, 2.95f, 18.849f, 4.06f, 18.589f, 5.13f)
                curveTo(18.329f, 6.2f, 17.449f, 7.05f, 16.369f, 7.36f)
                lineTo(20.189f, 16.1f)
                curveTo(21.029f, 18.03f, 21.059f, 19.7f, 20.259f, 20.92f)
                curveTo(19.719f, 21.75f, 18.499f, 22.75f, 15.839f, 22.75f)
                close()
                moveTo(8.439f, 2.75f)
                curveTo(7.549f, 2.75f, 6.819f, 3.48f, 6.819f, 4.37f)
                curveTo(6.819f, 4.8f, 6.999f, 5.22f, 7.289f, 5.52f)
                curveTo(7.589f, 5.82f, 8.009f, 5.99f, 8.439f, 5.99f)
                horizontalLineTo(8.739f)
                curveTo(8.989f, 5.99f, 9.229f, 6.12f, 9.369f, 6.33f)
                curveTo(9.509f, 6.54f, 9.529f, 6.81f, 9.429f, 7.04f)
                lineTo(5.179f, 16.69f)
                curveTo(4.549f, 18.13f, 4.469f, 19.34f, 4.969f, 20.1f)
                curveTo(5.589f, 21.05f, 7.039f, 21.25f, 8.149f, 21.25f)
                horizontalLineTo(15.829f)
                curveTo(16.929f, 21.25f, 18.369f, 21.05f, 18.999f, 20.1f)
                curveTo(19.499f, 19.33f, 19.429f, 18.13f, 18.809f, 16.7f)
                lineTo(14.599f, 7.04f)
                curveTo(14.499f, 6.81f, 14.519f, 6.54f, 14.659f, 6.33f)
                curveTo(14.799f, 6.12f, 15.029f, 5.99f, 15.289f, 5.99f)
                horizontalLineTo(15.449f)
                curveTo(16.249f, 5.99f, 16.969f, 5.48f, 17.139f, 4.77f)
                curveTo(17.279f, 4.2f, 17.119f, 3.64f, 16.709f, 3.23f)
                curveTo(16.399f, 2.92f, 15.989f, 2.75f, 15.559f, 2.75f)
                horizontalLineTo(8.439f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.841f, 15.04f)
                curveTo(13.181f, 15.04f, 12.471f, 14.95f, 11.761f, 14.71f)
                curveTo(8.921f, 13.76f, 5.991f, 13.86f, 5.961f, 13.86f)
                curveTo(5.561f, 13.92f, 5.201f, 13.55f, 5.181f, 13.14f)
                curveTo(5.161f, 12.73f, 5.491f, 12.38f, 5.901f, 12.36f)
                curveTo(6.031f, 12.35f, 9.141f, 12.25f, 12.231f, 13.28f)
                curveTo(14.831f, 14.15f, 17.381f, 12.5f, 17.411f, 12.48f)
                curveTo(17.751f, 12.25f, 18.221f, 12.35f, 18.451f, 12.69f)
                curveTo(18.681f, 13.03f, 18.591f, 13.5f, 18.241f, 13.73f)
                curveTo(18.151f, 13.8f, 16.251f, 15.04f, 13.841f, 15.04f)
                close()
            }
        }.build()

        return _Glass!!
    }

@Suppress("ObjectPropertyName")
private var _Glass: ImageVector? = null
