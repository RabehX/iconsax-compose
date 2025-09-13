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

val Iconsax.Outline.SmsStar: ImageVector
    get() {
        if (_SmsStar != null) {
            return _SmsStar!!
        }
        _SmsStar = ImageVector.Builder(
            name = "Outline.SmsStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.25f)
                horizontalLineTo(7f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7f, 2.75f)
                horizontalLineTo(12f)
                curveTo(12.41f, 2.75f, 12.75f, 3.09f, 12.75f, 3.5f)
                curveTo(12.75f, 3.91f, 12.41f, 4.25f, 12f, 4.25f)
                horizontalLineTo(7f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7f, 19.75f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(11.5f)
                curveTo(21.25f, 11.09f, 21.59f, 10.75f, 22f, 10.75f)
                curveTo(22.41f, 10.75f, 22.75f, 11.09f, 22.75f, 11.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 12.87f)
                curveTo(11.159f, 12.87f, 10.309f, 12.61f, 9.659f, 12.08f)
                lineTo(6.529f, 9.58f)
                curveTo(6.209f, 9.32f, 6.149f, 8.85f, 6.409f, 8.53f)
                curveTo(6.669f, 8.21f, 7.139f, 8.15f, 7.459f, 8.41f)
                lineTo(10.589f, 10.91f)
                curveTo(11.349f, 11.52f, 12.639f, 11.52f, 13.399f, 10.91f)
                curveTo(13.719f, 10.65f, 14.189f, 10.7f, 14.449f, 11.03f)
                curveTo(14.709f, 11.35f, 14.659f, 11.83f, 14.329f, 12.08f)
                curveTo(13.689f, 12.61f, 12.839f, 12.87f, 11.999f, 12.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.741f, 9.75f)
                curveTo(16.331f, 9.75f, 16.051f, 9.61f, 15.871f, 9.48f)
                curveTo(15.541f, 9.24f, 15.031f, 8.64f, 15.331f, 7.32f)
                lineTo(15.381f, 7.11f)
                curveTo(15.401f, 7.03f, 15.341f, 6.84f, 15.291f, 6.78f)
                lineTo(14.941f, 6.43f)
                curveTo(14.351f, 5.83f, 14.121f, 5.13f, 14.321f, 4.5f)
                curveTo(14.521f, 3.88f, 15.111f, 3.44f, 15.941f, 3.3f)
                lineTo(16.321f, 3.24f)
                curveTo(16.391f, 3.22f, 16.531f, 3.12f, 16.571f, 3.05f)
                lineTo(16.851f, 2.48f)
                curveTo(17.241f, 1.69f, 17.841f, 1.24f, 18.501f, 1.24f)
                curveTo(19.161f, 1.24f, 19.761f, 1.69f, 20.151f, 2.48f)
                lineTo(20.431f, 3.05f)
                curveTo(20.461f, 3.11f, 20.611f, 3.22f, 20.681f, 3.24f)
                lineTo(21.061f, 3.3f)
                curveTo(21.891f, 3.44f, 22.481f, 3.88f, 22.681f, 4.5f)
                curveTo(22.881f, 5.12f, 22.661f, 5.82f, 22.061f, 6.43f)
                lineTo(21.711f, 6.78f)
                curveTo(21.661f, 6.84f, 21.601f, 7.03f, 21.621f, 7.11f)
                lineTo(21.671f, 7.32f)
                curveTo(21.971f, 8.64f, 21.461f, 9.24f, 21.131f, 9.48f)
                curveTo(20.801f, 9.72f, 20.081f, 10.01f, 18.931f, 9.32f)
                lineTo(18.681f, 9.17f)
                curveTo(18.611f, 9.13f, 18.411f, 9.13f, 18.341f, 9.17f)
                lineTo(18.081f, 9.32f)
                curveTo(17.541f, 9.64f, 17.091f, 9.75f, 16.741f, 9.75f)
                close()
                moveTo(18.491f, 2.75f)
                curveTo(18.481f, 2.76f, 18.341f, 2.86f, 18.201f, 3.15f)
                lineTo(17.921f, 3.72f)
                curveTo(17.681f, 4.21f, 17.111f, 4.63f, 16.581f, 4.72f)
                lineTo(16.201f, 4.78f)
                curveTo(15.881f, 4.83f, 15.771f, 4.94f, 15.761f, 4.96f)
                curveTo(15.761f, 4.98f, 15.791f, 5.14f, 16.021f, 5.37f)
                lineTo(16.371f, 5.72f)
                curveTo(16.781f, 6.14f, 16.991f, 6.86f, 16.861f, 7.43f)
                lineTo(16.811f, 7.64f)
                curveTo(16.731f, 8f, 16.761f, 8.19f, 16.781f, 8.26f)
                curveTo(16.801f, 8.24f, 16.981f, 8.22f, 17.311f, 8.02f)
                lineTo(17.571f, 7.87f)
                curveTo(18.121f, 7.54f, 18.911f, 7.54f, 19.461f, 7.87f)
                lineTo(19.711f, 8.02f)
                curveTo(20.041f, 8.22f, 20.211f, 8.24f, 20.271f, 8.24f)
                curveTo(20.261f, 8.21f, 20.301f, 8.03f, 20.211f, 7.64f)
                lineTo(20.161f, 7.43f)
                curveTo(20.031f, 6.85f, 20.241f, 6.14f, 20.651f, 5.72f)
                lineTo(21.001f, 5.37f)
                curveTo(21.231f, 5.14f, 21.261f, 4.98f, 21.261f, 4.95f)
                curveTo(21.251f, 4.93f, 21.141f, 4.83f, 20.821f, 4.77f)
                lineTo(20.441f, 4.71f)
                curveTo(19.901f, 4.62f, 19.341f, 4.2f, 19.101f, 3.71f)
                lineTo(18.821f, 3.15f)
                curveTo(18.661f, 2.85f, 18.531f, 2.76f, 18.491f, 2.75f)
                close()
            }
        }.build()

        return _SmsStar!!
    }

@Suppress("ObjectPropertyName")
private var _SmsStar: ImageVector? = null
